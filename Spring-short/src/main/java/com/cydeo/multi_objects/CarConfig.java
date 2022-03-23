package com.cydeo.multi_objects;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarConfig {

    //To specify what @Bean to use if you have multiple use name="**" or make one bean as a Primary by @Primary
    @Bean(name = "c1")
    Car car1(){
        Car c = new Car();
        c.setMake("Audi");
        return c;
    }

    @Bean(name = "c2")
    Car car2(){
        Car c = new Car();
        c.setMake("Tesla");
        return c;
    }

}
