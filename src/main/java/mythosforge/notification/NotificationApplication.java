package mythosforge.notification;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NotificationApplication {
	public static void main(String[] args) {
        NotificationService service = 
            new EmailDecorator(
                new SmsDecorator(
                    new PushDecorator(new NotificationDefault())
                )
            );
        service.send("Hello World");
        // Chama NotificacaoSimples, depois Push, depois SMS, depois Email, em cadeia.
    }
}
