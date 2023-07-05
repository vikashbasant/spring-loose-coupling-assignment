package com.di.springloosecouplingassignment;

public class MissedCallAlertService implements Service{
    @Override
    public void service () {
        System.out.println("Hey, Missed Call Alert Service Activated!");
    }
}
