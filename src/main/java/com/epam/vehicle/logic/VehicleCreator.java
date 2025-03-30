package com.epam.vehicle.logic;

import com.epam.vehicle.model.Car;
import com.epam.vehicle.model.Train;
import com.epam.vehicle.model.Vehicle;

public class VehicleCreator {
    public Vehicle createVehicle(String input) {
        if (input == null || input.isBlank()) {
            throw new IllegalArgumentException("Input cannot be null or blank");
        }

        String[] tokens = input.split(",");
        String type = tokens[0].trim();

        try {
            switch (type) {
                case "Car":
                    if (tokens.length != 5) throw new IllegalArgumentException("Invalid Car input");
                    return new Car(
                            tokens[1].trim(),
                            tokens[2].trim(),
                            Long.parseLong(tokens[3].trim()),
                            Integer.parseInt(tokens[4].trim())
                    );
                case "Train":
                    if (tokens.length != 4) throw new IllegalArgumentException("Invalid Train input");
                    return new Train(
                            tokens[1].trim(),
                            tokens[2].trim(),
                            Long.parseLong(tokens[3].trim())
                    );
                default:
                    throw new IllegalArgumentException("Unknown vehicle type: " + type);
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid numeric format in input", e);
        }
    }
}
