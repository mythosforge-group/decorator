package mythosforge.notification;

public class SmsDecorator extends NotificationDecorator {
    public SmsDecorator(NotificationService service) {
        super(service);
    }

    @Override
    public void send(String msg) {
        super.send(msg);
        System.out.println("Sending SMS: " + msg);
    }
}