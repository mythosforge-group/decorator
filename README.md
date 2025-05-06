```
notification/
├─ pom.xml                   (dependências Spring Boot e configuração)
└─ src/main/java/com/exemplo/notification/
   ├─ NotificationService.java     (interface Component)
   ├─ DefaultNotification.java     (ConcreteComponent)
   ├─ NotificationDecorator.java    (classe abstrata Decorator)
   ├─ EmailDecorator.java          (ConcreteDecorator)
   ├─ SmsDecorator.java            (ConcreteDecorator)
   ├─ PushDecorator.java           (ConcreteDecorator)
   └─ Application.java             (classe @SpringBootApplication para rodar o exemplo)
```
