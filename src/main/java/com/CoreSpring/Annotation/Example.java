package com.CoreSpring.Annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Example() {
        super();
    }

    public String toString() {
        return "Example [subject=" + subject + "]";
    }

    @PostConstruct
    public void init() {
        System.out.println("Call Method");
    }

    @PreDestroy
    public void Destroy() {
        System.out.println("Clean ");
    }
}
