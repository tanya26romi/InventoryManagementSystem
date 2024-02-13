package service;

import dao.CustomersDao;
import entities.Customers;

import java.util.Map;

public class CustomerService {

    public CustomersDao customersDao;
     public CustomerService(){
         customersDao = new CustomersDao();
     }

     public Customers addCustomers(String name, String mobile){
         Map<String, Customers> customersMap = customersDao.getCustomerMap();
         if(!customersMap.containsKey(mobile)){
             Customers customers = new Customers(name, mobile);
             customersMap.put(mobile, customers);
         }
         return customersMap.get(mobile);
     }
}
