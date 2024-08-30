package com.example.SpringDemo;

import org.springframework.stereotype.Component;

@Component
// Component tag is must, if we want to create the bean of the Alien class using sprint.
// Otherwise, ICO container do not know about the existence of the class Alien
public class Alien {

    public Alien() {
        System.out.println("Creating bean for Alien class");
    }

    public void code () {
        System.out.println("Coding!!!");
    }
}
