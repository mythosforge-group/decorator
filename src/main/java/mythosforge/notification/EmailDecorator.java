package mythosforge.notification;

import org.springframework.stereotype.Component;

@Component
public class EmailDecorator extends NotificationDecorator {
    public EmailDecorator(NotificationService service) {
        super(service);
    }
    @Override
    public void send(String msg) {
        super.send(msg);
        System.out.println("Enviando email: " + msg);
    }
}