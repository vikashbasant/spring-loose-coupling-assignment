package com.di.springloosecouplingassignment;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    public static void main(String[] args){

        // Creating an object using beans.xml file
        // inside the beans.xml file, we need to specify the class which we want an object:
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("=>> beans.xml config load<<=");

        // Get Beans with id="aService" from beans.xml file:
        AirtelService aService = context.getBean("aService", AirtelService.class);
        aService.operatorService();

    }

}
