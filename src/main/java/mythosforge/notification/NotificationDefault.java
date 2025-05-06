package mythosforge.notification;

import org.springframework.stereotype.Component;

@Component
public class NotificationDefault implements NotificationService {
    @Override
    public void send(String msg) {
        System.out.println("Default notification: " + msg);
    }
}