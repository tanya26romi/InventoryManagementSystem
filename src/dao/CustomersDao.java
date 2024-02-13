package dao;

import entities.Customers;

import java.util.HashMap;
import java.util.Map;

public class CustomersDao {

    public Map<String, Customers> customerMap;

    public CustomersDao() {
        this.customerMap = new HashMap<>();
    }

    public Map<String, Customers> getCustomerMap() {
        return customerMap;
    }

    public void setCustomerMap(Map<String, Customers> customerMap) {
        this.customerMap = customerMap;
    }
}
