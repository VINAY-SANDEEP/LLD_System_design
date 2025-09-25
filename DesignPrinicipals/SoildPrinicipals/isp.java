// Instead of one bulky IMachine interface
interface IInventoryManager {
    void updateStock(String productId, int qty);
}

interface IDiscountManager {
    void applyDiscount(String productId, double percentage);
}

// A simple product only needs inventory management
class Product implements IInventoryManager {
    public void updateStock(String productId, int qty) {
        System.out.println("Stock updated for: " + productId + ", Quantity: " + qty);
    }
}

// Special product also allows discounting
class DiscountedProduct extends Product implements IDiscountManager {
    public void applyDiscount(String productId, double percentage) {
        System.out.println("Applied discount of " + percentage + "% on " + productId);
    }
}
