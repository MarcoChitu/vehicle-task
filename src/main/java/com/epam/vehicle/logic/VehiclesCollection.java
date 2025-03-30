package com.epam.vehicle.logic;

import com.epam.vehicle.model.Car;
import com.epam.vehicle.model.Vehicle;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class VehiclesCollection {
    private final List<Vehicle> vehicles = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public Vehicle getVehicle(String make, String model) {
        return vehicles.stream()
                .filter(v -> v.getMake().equalsIgnoreCase(make) && v.getModel().equalsIgnoreCase(model))
                .findFirst()
                .orElseThrow(NoSuchElementException::new);
    }

    public List<Car> getCarsWhereModelYearIsBeforeSortedBySpeed(int modelYear) {
        return vehicles.stream()
                .filter(v -> v instanceof Car)
                .map(v -> (Car) v)
                .filter(car -> car.getModelYear() < modelYear)
                .sorted(Comparator.comparingLong(Car::getSpeed))
                .collect(Collectors.toList());
    }
}
