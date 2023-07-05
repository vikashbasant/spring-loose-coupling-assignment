package com.di.springloosecouplingassignment;

public class HelloTuneService implements Service{
    @Override
    public void service () {
        System.out.println("Hey, Hello Tune Service Activated!");
    }
}
