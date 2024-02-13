package service;

import dao.BillsDao;
import entities.Bills;
import entities.UserPurchaseOrders;
import enums.PaymentMode;
import enums.Status;

import java.util.Map;

public class BillService {

    public BillsDao billsDao;

    public BillService() {
        billsDao = new BillsDao();
    }
    public Bills generateBill(UserPurchaseOrders order, double paymentAmount, String paymentMode) {
        Map<String, Bills> billsMap = billsDao.getBillMap();

        Bills bills = new Bills(order.getOrderAmount(),
                order.getOrderAmount(),
                paymentAmount,
                order.getId(),
                PaymentMode.valueOf(paymentMode), Status.SUCCESS);

        billsMap.put(bills.getId(), bills);

        return bills;
    }
}
