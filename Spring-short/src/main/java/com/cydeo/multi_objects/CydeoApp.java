package com.cydeo.multi_objects;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {
    public static void main(String[] args) {
        ApplicationContext container= new AnnotationConfigApplicationContext(CarConfig.class);
        Car car1 = container.getBean("c1",Car.class);
        System.out.println(car1.getMake());

        Car car2 = container.getBean("c2",Car.class);
        System.out.println(car2.getMake());


    }
}
