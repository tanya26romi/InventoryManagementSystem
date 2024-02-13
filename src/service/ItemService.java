package service;

import dao.ItemDao;
import entities.Items;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ItemService {

    ItemDao itemDao;

    public ItemService() {
        itemDao = new ItemDao();
    }

    public void addItem(String name, String category, int quantity, double mrp){
        Items items = new Items(name, category, quantity, mrp);
        Map<Long, Items> itemMap = itemDao.getItemMap();
        itemMap.put(items.getId(), items);
    }

    public void displayItem(){
        Map<Long, Items> itemMap = itemDao.getItemMap();
        itemMap.forEach((key, value) -> {
            System.out.println(key + " "+ value.getName()+ " "+ value.getQuantity());
        });
    }

    public boolean validate(long id, int quantity){
        Map<Long, Items> itemMap = itemDao.getItemMap();

        Items items = itemMap.get(id);
        if(items.getQuantity() < quantity){
            return false;
        }
        return true;
    }


    public void updateAvailableItem(long itemId, int quantity) {
        Map<Long, Items> itemMap = itemDao.getItemMap();
        Items items = itemMap.get(itemId);
        items.setQuantity(items.getQuantity()-quantity);
        itemMap.put(itemId, items);

        if(items.getQuantity()==0){
            itemMap.remove(itemId);
        }
    }

    public double findTotalAmount(Map<Long, Integer> userOrder) {
        Map<Long, Items> itemMap = itemDao.getItemMap();

        final double[] amount = {0};

        userOrder.forEach((key, value) -> {
            Items items = itemMap.get(key);
            amount[0] += items.getMrp() * value;
        });

        return amount[0];
    }

    public List<Items> getAllItems(Map<Long, Integer> userOrder) {
        Map<Long, Items> itemMap = itemDao.getItemMap();

        List<Items> itemsList = new ArrayList<>();

        userOrder.forEach((key, value) -> {
            Items items = itemMap.get(key);
            itemsList.add(items);
        });

        return itemsList;
    }
}
