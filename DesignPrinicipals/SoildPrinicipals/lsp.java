class OrderProcessor {
    public void processOrder(PaymentMethod payment, double amount) {
        payment.pay(amount); // Works for CreditCard, UPI, PayPal, etc.
    }
}
