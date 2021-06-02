package Example.CustomEvent;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("ce.xml");
        CustomEventPublisher cep = (CustomEventPublisher) context.getBean("customEventPublisher");
        cep.Publish();

    }
}
