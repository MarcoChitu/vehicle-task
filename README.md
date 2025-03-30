# Vehicle Simulation Project

This Java application simulates a simple vehicle system that models cars and trains. It demonstrates object-oriented design principles such as inheritance, polymorphism, encapsulation, and factory design patterns.

## 📁 Project Structure
```
src
├── main
│   └── java
│       └── com.epam.vehicle
│           ├── Application.java
│           ├── model
│           │   ├── Vehicle.java
│           │   ├── Car.java
│           │   └── Train.java
│           └── logic
│               ├── VehicleCreator.java
│               └── VehiclesCollection.java
└── test
    └── java
        └── com.epam.vehicle
            ├── VehicleCreatorTest.java
            └── VehiclesCollectionTest.java
```

## 🚗 Features
- **Vehicle**: Base class representing a generic vehicle
- **Car**: Subclass with additional `modelYear`
- **Train**: Subclass with overridden `move()` method to simulate acceleration
- **VehicleCreator**: Factory that parses string input and creates `Car` or `Train`
- **VehiclesCollection**: Utility to store, retrieve, and filter vehicles
- **Application**: Demonstrates core functionality with hardcoded examples

## ✅ How to Run
Ensure you have Java 11+ and an IDE like IntelliJ IDEA:

```sh
# Compile
javac -d out src/main/java/com/epam/vehicle/**/*.java

# Run
java -cp out com.epam.vehicle.Application
```

## 📄 Sample Output
```
Creating vehicles
Car{make='Toyota', model='Corolla', speed=140, modelYear=1966}
Car{make='Volkswagen', model='Beetle', speed=100, modelYear=1938}
Car{make='Opel', model='Astra', speed=160, modelYear=1991}
Train{make='Siemens', model='ICE 4', speed=300}

Astra is moving for 1.5 hours
Distance covered: 240

Siemens ICE 4 is moving for 1 hour
Distance covered: 285

Cars that model year is before 1970, sorted by speed:
Car{make='Volkswagen', model='Beetle', speed=100, modelYear=1938}
Car{make='Toyota', model='Corolla', speed=140, modelYear=1966}
```

## 🧪 Testing
JUnit tests are provided for:
- Valid and invalid input parsing in `VehicleCreator`
- Search and filtering in `VehiclesCollection`

## 👨‍💻 Authors
Developed by Marco Chitu

## 📝 License
MIT License or EPAM internal use.

