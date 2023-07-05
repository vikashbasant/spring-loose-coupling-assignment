package com.di.springloosecouplingassignment;

public class AirtelService {
    private Service service;

    public AirtelService (Service service) {
        this.service = service;
    }

    public void operatorService(){
        this.service.service();
    }
}


