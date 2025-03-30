package com.epam.vehicle.model;

public class Vehicle {
    private String make;
    private String model;
    private long speed;

    public Vehicle(String make, String model, long speed) {
        this.make = make;
        this.model = model;
        this.speed = speed;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public long getSpeed() {
        return speed;
    }

    public long move(double duration) {
        return Math.round(speed * duration);
    }

}

