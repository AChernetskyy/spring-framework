package com.cydeo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DealerApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigCar.class);
        Car c = context.getBean(Car.class);
        Person p = context.getBean(Person.class);
        System.out.println("Person's name is "+ p.getName());
        System.out.println("Car's name is "+ c.getMake());
        System.out.println("Person's car is "+ p.getCar().getMake());
    }
}