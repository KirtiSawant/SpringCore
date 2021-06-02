package Example.MessageSource;

import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Locale;

public class Test {
    public static void main(String[] args) {
        MessageSource resources = new ClassPathXmlApplicationContext("msg.xml");
        String message = resources.getMessage("greeting", null, "Default", Locale.ENGLISH);
        System.out.println(message);
    }

}
