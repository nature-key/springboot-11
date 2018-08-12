package com.springboot;

import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MyEventHandler {
    @EventListener
    public void Event(MyApplicationEvent event) {
        System.out.println("MyEventHandler" + event.getClass());
    }
    @EventListener
    public void Event1(ContextStoppedEvent event) {
        System.out.println("MyEventHandler" + event.getClass());
    }


}
