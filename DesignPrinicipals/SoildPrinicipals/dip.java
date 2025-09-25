// Abstraction
interface NotificationService {
    void send(String message);
}

// Low-level implementations
class EmailNotification implements NotificationService {
    public void send(String message) {
        System.out.println("Email sent: " + message);
    }
}

class SMSNotification implements NotificationService {
    public void send(String message) {
        System.out.println("SMS sent: " + message);
    }
}

// High-level class depends on abstraction, not implementation
class OrderNotifier {
    private NotificationService notificationService;

    public OrderNotifier(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void notifyUser(String message) {
        notificationService.send(message);
    }
}
