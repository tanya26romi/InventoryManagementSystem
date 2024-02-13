package dao;

import entities.Items;

import java.util.HashMap;
import java.util.Map;

public class ItemDao {
    public Map<Long, Items> itemMap;

    public ItemDao() {
        this.itemMap = new HashMap<>();
    }

    public Map<Long, Items> getItemMap() {
        return itemMap;
    }

    public void setItemMap(Map<Long, Items> itemMap) {
        this.itemMap = itemMap;
    }
}
