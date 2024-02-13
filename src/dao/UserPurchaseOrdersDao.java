package dao;

import entities.UserPurchaseOrders;

import java.util.HashMap;
import java.util.Map;

public class UserPurchaseOrdersDao {
    public Map<String, UserPurchaseOrders> ordersMap;

    public UserPurchaseOrdersDao() {
        this.ordersMap = new HashMap<>();
    }

    public Map<String, UserPurchaseOrders> getOrdersMap() {
        return ordersMap;
    }

    public void setOrdersMap(Map<String, UserPurchaseOrders> ordersMap) {
        this.ordersMap = ordersMap;
    }
}
