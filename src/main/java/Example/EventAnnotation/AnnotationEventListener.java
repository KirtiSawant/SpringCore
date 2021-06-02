package Example.EventAnnotation;

import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class AnnotationEventListener {
    @EventListener
    public void handlerContextStart(ContextStartedEvent event) {
        System.out.println("Context Start");
    }
}
