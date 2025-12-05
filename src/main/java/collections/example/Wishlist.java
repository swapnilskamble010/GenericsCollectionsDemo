package collections.example;

import java.util.HashSet;
import java.util.Set;

public class Wishlist {
    private Set<Item> itemWishlist;

    public Wishlist() {
        itemWishlist = new HashSet<>();
    }

    public void addToWishlist(Item item) {
        itemWishlist.add(item);
    }

    public void removeFromWishlist(Item item) {
        itemWishlist.remove(item);
    }

    public Set<Item> getWishlist() {
        return itemWishlist;
    }
}
