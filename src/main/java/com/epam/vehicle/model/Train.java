package com.epam.vehicle.model;

public class Train extends Vehicle {

    public Train(String make, String model, long speed) {
        super(make, model, speed);
    }

    /**
     * Calculates the distance traveled by the train in a given duration.
     * Trains take time to accelerate and decelerate.
     * @param duration The duration in hours.
     * @return The distance traveled in kilometers.
     */
    @Override
    public long move(double duration) {
        double slowDuration = 0.2;
        double fullSpeedDuration = Math.max(0, duration - slowDuration);
        double distance = (getSpeed() / 2.0 * slowDuration) + (getSpeed() * fullSpeedDuration);
        return Math.round(distance); // ✅ returns long
    }


    @Override
    public String toString() {
        return "Train{" +
                "make='" + getMake() + '\'' +
                ", model='" + getModel() + '\'' +
                ", speed=" + getSpeed() +
                '}';
    }
}


