package com.di.springloosecouplingassignment;

public class DataService implements Service{
    @Override
    public void service () {
        System.out.println("Hey, Data Service Activated!");
    }
}
