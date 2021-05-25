import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation {
    int getValue() default 2;

    String getMessage() default "Hello";

    double getDouble() default 2.2;
}

class Message {
    @MyAnnotation
    public void displayHi() {
        System.out.println("Hii");
    }
}

public class MyAnnotationDemo {
    public static void main(String[] args) throws NoSuchMethodException, SecurityException {
        Message message = new Message();
        Method method = message.getClass().getMethod("displayHi");
        MyAnnotation a = method.getAnnotation(MyAnnotation.class);
        System.out.println("Value is:" + a.getValue());
        System.out.println("Message is:" + a.getMessage());
        System.out.println("Double Value:" + a.getDouble());


    }

}
