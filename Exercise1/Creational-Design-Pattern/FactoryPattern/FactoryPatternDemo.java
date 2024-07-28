interface Notification {
    void notifyUser();
}

class SMSNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending an SMS notification");
    }
}

class EmailNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending an Email notification");
    }
}

class NotificationFactory {
    public static Notification createNotification(String type) {
        if (type.equals("SMS")) {
            return new SMSNotification();
        } else if (type.equals("Email")) {
            return new EmailNotification();
        }
        return null;
    }
}

// Usage
public class FactoryPatternDemo {
    public static void main(String[] args) {
        Notification notification = NotificationFactory.createNotification("SMS");
        notification.notifyUser();
        
        notification = NotificationFactory.createNotification("Email");
        notification.notifyUser();
    }
}
