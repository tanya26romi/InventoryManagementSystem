package service;

import dao.UserPurchaseOrdersDao;
import entities.Customers;
import entities.Items;
import entities.UserPurchaseOrders;

import java.util.List;
import java.util.Map;

public class OrderService {

    public UserPurchaseOrdersDao userPurchaseOrdersDao;
    public ItemService itemService;

    public OrderService() {
        userPurchaseOrdersDao = new UserPurchaseOrdersDao();
    }

    public boolean validateOrderAmount(UserPurchaseOrders order, double paymentAmount) {
        return order.getOrderAmount() == paymentAmount;
    }

    public UserPurchaseOrders processOrder(double orderAmount, List<Items> items, Customers customers) {
        Map<String, UserPurchaseOrders> ordersMap = userPurchaseOrdersDao.getOrdersMap();

        UserPurchaseOrders orders = new UserPurchaseOrders(items, items.size(), customers.getId(), orderAmount);
        ordersMap.put(orders.getId(), orders);

        return orders;
    }
}
