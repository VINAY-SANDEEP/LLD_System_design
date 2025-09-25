// Base class (Open for extension, closed for modification)
interface PaymentMethod {
    void pay(double amount);
}

// Credit Card implementation
class CreditCardPayment implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}

// UPI implementation
class UPIPayment implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI.");
    }
}

// PayPal implementation
class PayPalPayment implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using PayPal.");
    }
}
