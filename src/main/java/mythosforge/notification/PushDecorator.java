package mythosforge.notification;

public class PushDecorator extends NotificationDecorator {
    public PushDecorator(NotificationService service) {
        super(service);
    }

    @Override
    public void send(String msg) {
        super.send(msg);
        System.out.println("Sending push notification: " + msg);
    }
}
