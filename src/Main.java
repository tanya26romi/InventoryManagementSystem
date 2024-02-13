import entities.Bills;
import entities.Customers;
import entities.Items;
import entities.UserPurchaseOrders;
import enums.PaymentMode;
import service.BillService;
import service.CustomerService;
import service.ItemService;
import service.OrderService;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ItemService itemService = new ItemService();
        OrderService orderService = new OrderService();
        CustomerService customerService = new CustomerService();
        BillService billService = new BillService();

        while (true) {


            System.out.println("Choose your choice");
            System.out.println("1. Customer want to purchase items");
            System.out.println("2. Admin add the item");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();

            if(choice == 6){
                System.out.println("Bye Bye!!");
                break;
            }
            switch (choice) {
                case 1:
                    Map<Long, Integer> userOrder = new HashMap<>();
                    while (true) {
                        System.out.println("List of Items");
                        itemService.displayItem();
                        System.out.println("Choose item");
                        long itemId = scanner.nextLong();
                        System.out.println("Enter quantity");
                        int quantity = scanner.nextInt();
                        scanner.nextLine();

                        if (!itemService.validate(itemId, quantity)) {
                            System.out.println("Please Enter Valid Quantity");
                            continue;
                        }
                        userOrder.put(itemId, quantity);

                        itemService.updateAvailableItem(itemId, quantity);

                        System.out.println("Want to proceed to payment ??");
                        String userInput = scanner.nextLine();
                        if (userInput.equalsIgnoreCase("YES")) {
                            System.out.println("Please Enter Details");
                            System.out.println("Please enter name");
                            String userName = scanner.nextLine();
                            System.out.println("Please enter mobile");
                            String mobile = scanner.nextLine();
                            //Future case can add check on mobile number

                            Customers customers = customerService.addCustomers(userName, mobile);

                            double orderAmount = itemService.findTotalAmount(userOrder);
                            List<Items> items = itemService.getAllItems(userOrder);
                            UserPurchaseOrders order = orderService.processOrder(orderAmount, items, customers);

                            System.out.println("Total Order Amount "+order.getOrderAmount());

                            System.out.println(PaymentMode.paymentModeList);

                            System.out.println("Please select Payment Mode");
                            String paymentMode = scanner.nextLine();

                            double paymentAmount;

                            while (true){
                                System.out.println("Please pay the amount");
                                paymentAmount = scanner.nextDouble();

                                if(!orderService.validateOrderAmount(order, paymentAmount)){
                                    System.out.println("Please pay the correct amount");
                                }
                                else{
                                    break;
                                }
                            }

                            Bills bills = billService.generateBill(order, paymentAmount, paymentMode);

                            System.out.println("Order Completed!! Hurray!!!");
                            System.exit(0);
                            break;
                        }
                    }
                    break;

                case 2:
                    scanner.nextLine();
                    System.out.println("Enter item name");
                    String name = scanner.nextLine();
                    System.out.println("Enter category");
                    String category = scanner.nextLine();
                    System.out.println("Enter quantity");
                    int quantity = scanner.nextInt();
                    System.out.println("Enter MRP");
                    double mrp = scanner.nextDouble();

                    itemService.addItem(name, category, quantity, mrp);
                    break;


            }
        }

    }
}