package collections.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Inventory<T extends Item> {
    private HashMap<String, T> items;

    public Inventory() {
        items = new HashMap<>();
    }

    public T getItem(String itemId) {
        return items.get(itemId);
    }

    public List<T> getAllItems() {
        return new ArrayList<>(items.values());
    }

    public void addItem(T item) {
        items.put(item.getId(), item);
    }

    public void removeItem(T item) {
        items.remove(item.getId());
    }

    public void removeItem(String itemId) {
        items.remove(itemId);
    }

    public List<T> filterByPriceRange(double minPrice, double maxPrice) {
        List<T> filteredItems = new ArrayList<>();
        for(T item: items.values()){
            if(item.getPrice() >= minPrice && item.getPrice() <= maxPrice){
                filteredItems.add(item);
            }
        }
        return filteredItems;
    }

    public List<T> filterByAvailability(){
        List<T> filteredItems = new ArrayList<>();
        for(T item: items.values()){
            if(item.getQuantity() > 0){
                filteredItems.add(item);
            }
        }
        return filteredItems;
    }
}
