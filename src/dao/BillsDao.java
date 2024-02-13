package dao;

import entities.Bills;

import java.util.HashMap;
import java.util.Map;

public class BillsDao {

    public Map<String, Bills> billMap;

    public BillsDao() {
        this.billMap = new HashMap<>();
    }

    public Map<String, Bills> getBillMap() {
        return billMap;
    }

    public void setBillMap(Map<String, Bills> billMap) {
        this.billMap = billMap;
    }
}
