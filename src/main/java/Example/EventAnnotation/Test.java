package Example.EventAnnotation;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("a.xml");

        AnnotationEventListener an = (AnnotationEventListener) context.getBean("annotationEventListener");
        // an.handlerContextStart();
        context.start();


    }
}
