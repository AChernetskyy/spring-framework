package com.cydeo.bean_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {
    public static void main(String[] args) {

        /*
        Normal Way how to create an object,without @Bean

        FullTimeMentor fullTimeMentor = new FullTimeMentor();
        PartTimeMentor partTimeMentor = new PartTimeMentor();

        fullTimeMentor.createAccount();
        partTimeMentor.createAccount();
         */

        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class, AnotherConfigApp.class);

        FullTimeMentor fullTimeMentor = container.getBean(FullTimeMentor.class);
        fullTimeMentor.createAccount();

        PartTimeMentor partTimeMentor = container.getBean(PartTimeMentor.class);
        partTimeMentor.createAccount();

        String str = container.getBean(String.class);
        System.out.println(str);

        Integer integer = container.getBean(Integer.class);
        System.out.println(integer);


    }
}
