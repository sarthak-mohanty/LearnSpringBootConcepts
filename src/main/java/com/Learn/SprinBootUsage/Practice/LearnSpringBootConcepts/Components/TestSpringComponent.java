package com.Learn.SprinBootUsage.Practice.LearnSpringBootConcepts.Components;

import org.springframework.stereotype.Component;

@Component
public class TestSpringComponent {
    public String getMessgage(){
        return "This is a Spring component";
    }

    public String getNewMessage(){
        return "This is a new Messgage inside a spring component";
    }
}
