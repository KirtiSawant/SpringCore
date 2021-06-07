package Example.Res.DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("B.xml");
        MyBean bean = (MyBean) context.getBean("myBean");
        // bean.setTemplate();
    }
}
