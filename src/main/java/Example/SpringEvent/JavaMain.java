package Example.SpringEvent;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaMain {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("custom.xml");
        context.refresh();
        context.start();
        HelloWorld hello = (HelloWorld) context.getBean("helloWorld");
        hello.getMessage();
        context.stop();

    }
}
