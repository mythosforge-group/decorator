package mythosforge.notification;


public abstract class NotificationDecorator implements NotificationService {
    protected NotificationService service;
    public NotificationDecorator(NotificationService service) {
        this.service = service;
    }
    @Override
    public void send(String msg) {
        service.send(msg);
    }
}
