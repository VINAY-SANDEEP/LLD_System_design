// Handles only user data
class User {
    private String name;
    private String email;
    // getters & setters
}

// Handles only order-related logic
class Order {
    private String orderId;
    private double amount;
    // getters & setters
}

// Handles only payment processing
class PaymentProcessor {
    public void processPayment(Order order) {
        System.out.println("Processing payment for order: " + order.getOrderId());
    }
}
