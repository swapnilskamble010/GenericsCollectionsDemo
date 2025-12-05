package collections.example;

import javax.xml.transform.Source;
import java.util.*;

public class Client {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        items.add(new Electronics("E1", "Laptop", 2, 80102.9, 2));
        items.add(new Clothing("C1", "T-Shirt", 5, 799.9, "L"));
        items.add(new Book("B1", "Book 1", 10, 199, "Lucy"));
        System.out.println("Items are: " + items);
        for (Item item : items) {
            System.out.println(item.getName() + " - " + item.getPrice());
        }

        Collections.sort(items);
        System.out.println("Sorted Items are: " + items);
        for (Item item : items) {
            System.out.println(item.getName() + " - " + item.getPrice());
        }

        System.out.println("************************************");
        System.out.println("Electronics Inventory");
        Inventory<Electronics> electronicsInventory = new Inventory<>();
        electronicsInventory.addItem(new Electronics("E1", "Laptop", 3, 801029.9, 2));
        electronicsInventory.addItem(new Electronics("E2", "Mobile", 0, 25364.9, 2));
        electronicsInventory.addItem(new Electronics("E3", "Tab", 8, 23000.9, 2));
//        electronicsInventory.addItem(new Book("B9", "Book 9", 10, 199, "UNknown"));
        System.out.println("Items list from Electronics Inventory are: ");
        for (Item item: electronicsInventory.getAllItems()) {
            System.out.println(item.getName() + " - " + item.getPrice());
        }

        System.out.println("************************************");
        System.out.println("Clothing Inventory");
        Inventory<Clothing> clothingInventory = new Inventory<>();
        clothingInventory.addItem(new Clothing("C1", "T-Shirt", 5, 799.9, "L"));
        clothingInventory.addItem(new Clothing("C2", "Jeans", 5, 799.9, "M"));
        clothingInventory.addItem(new Clothing("C3", "Formals", 5, 799.9, "XL"));
        clothingInventory.addItem(new Clothing("C3", "Formals", 5, 808.9, "XL"));
        clothingInventory.addItem(new Clothing("C3", "Formals", 5, 109.99, "XL"));
        System.out.println("Items list from Clothing Inventory are: " );
        for (Item item: clothingInventory.getAllItems()) {
            System.out.println(item.getName() + " - " + item.getPrice());
        }

        System.out.println("Second Clothing Item - " + clothingInventory.getItem("C2").getName());
        clothingInventory.removeItem("C3");

        System.out.println("Items list from Clothing Inventory after removing 3rd are: " );
        for (Item item: clothingInventory.getAllItems()) {
            System.out.println(item.getName() + " - " + item.getPrice());
        }

        System.out.println("************************************");
        Item item1 = new Electronics("E1", "Laptop", 2, 80102.9, 1);
        Item item2 = new Electronics("E2", "Mobile", 2, 345, 2);
        Item item3 = new Electronics("E3", "Watch", 2, 45, 3);
        Item item4 = new Electronics("E4", "iPad", 2, 3546.7, 5);
        Item item5 = new Electronics("E5", "Fan", 2, 45.75, 6);
        Item item6 = new Electronics("E6", "Tube", 1, 55, 6);
        Item item7 = new Book("B1", "Book 1", 10, 199, "Lucy");

        RecentlyViewedItems recentlyViewedItems = new RecentlyViewedItems();
        recentlyViewedItems.addRecentlyViewedItem(item3);
        recentlyViewedItems.addRecentlyViewedItem(item2);
        recentlyViewedItems.addRecentlyViewedItem(item5);
        recentlyViewedItems.addRecentlyViewedItem(item2);
        recentlyViewedItems.addRecentlyViewedItem(item5); //325
        recentlyViewedItems.addRecentlyViewedItem(item3);
        recentlyViewedItems.addRecentlyViewedItem(item4);
        recentlyViewedItems.addRecentlyViewedItem(item1);
        recentlyViewedItems.addRecentlyViewedItem(item4);
        recentlyViewedItems.addRecentlyViewedItem(item6);
        recentlyViewedItems.addRecentlyViewedItem(item7);

        System.out.println("Items list from RecentlyViewedItems are: ");
        List<Item> recentlyViewedItemsList = recentlyViewedItems.getRecentlyViewedItems();
        for (Item item: recentlyViewedItemsList) {
            System.out.println(item.getId() + " - " + item.getName());
        }

        System.out.println("***********************");
        System.out.println("Comparator sorting : Descending order of quantity");
        Collections.sort(items);
//        Collections.sort(items, new ItemQuantityComparator());
        for (Item item: items) {
            System.out.println(item.getName() + " - " + item.getQuantity() + " - " + item.getPrice());
        }
        //sort by price
        List<Electronics> electronicsList = electronicsInventory.getAllItems();
        System.out.println("Items list from Electronics Inventory are: ");
        for (Electronics electronics: electronicsList) {
            System.out.println(electronics.getName() + " - " + electronics.getPrice());
        }
        electronicsList.sort(new ItemPriceComparator());
        System.out.println("Items list from Electronics Inventory are(After sort by price): ");
        for (Electronics electronics: electronicsList) {
            System.out.println(electronics.getName() + " - " + electronics.getPrice());
        }
        //sort by quantity
        System.out.println("before sort by quantity");
        for (Electronics electronics: electronicsList) {
            System.out.println(electronics.getName() + " - " + electronics.getPrice() + " - " + electronics.getQuantity());
        }
        Collections.sort(electronicsList, new ItemQuantityComparator());
        System.out.println("after sort by quantity");
        for (Electronics electronics: electronicsList) {
            System.out.println(electronics.getName() + " - " + electronics.getPrice() + " - " + electronics.getQuantity());
        }
        // ---- Filtering Tests ----
        System.out.println("\nFilter: Price between 20000 and 30000");
        electronicsList = electronicsInventory.filterByPriceRange(20000, 30000);
        for (Electronics electronics: electronicsList) {
            System.out.println(electronics.getName() + " - " + electronics.getPrice() + " - " + electronics.getQuantity());
        }
        System.out.println("\nFilter: Available Items (quantity > 0)");
        electronicsList = electronicsInventory.filterByAvailability();
        for (Electronics electronics: electronicsList) {
            System.out.println(electronics.getName() + " - " + electronics.getPrice() + " - " + electronics.getQuantity());
        }

        System.out.println("***********************");
        Order order1 = new Order("1", true);
        Order order2 = new Order("2", false);
        Order order3 = new Order("3", false);
        Order order4 = new Order("4", true);
        Order order5 = new Order("5", true);

        OrderProcessor orderProcessor = new OrderProcessor();
        orderProcessor.addOrder(order1);
        orderProcessor.addOrder(order2);
        orderProcessor.addOrder(order3);
        orderProcessor.addOrder(order4);
        orderProcessor.addOrder(order5);

        while (orderProcessor.getSize()>0){
            orderProcessor.processOrder();
        }

        System.out.println("***********************");
        Item newItem1 = new Book("B1", "Book 1", 10, 199, "Lucy");
        Item newItem2 = new Electronics("E6", "Tube", 1, 55, 6);
        Item newItem3 = new Clothing("C2", "Jeans", 5, 799.9, "M");

        Wishlist newWishlist = new Wishlist();
        newWishlist.addToWishlist(newItem1);
        newWishlist.addToWishlist(newItem2);
        newWishlist.addToWishlist(newItem2);
        newWishlist.addToWishlist(newItem3);
        newWishlist.removeFromWishlist(newItem2);

        Set<Item> wishlistSet = newWishlist.getWishlist();
        System.out.println("Items in the wishlist are: " );
        for(Item item: wishlistSet){
            System.out.println(item.getId() + " - " + item.getName());
        }
    }
}
