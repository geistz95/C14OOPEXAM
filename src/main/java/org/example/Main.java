package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args){

        //Step 1
        Car car = new Car("Lambo", 120, 1000, new Engine(Size.M));
        Plane plane = new Plane("Boeing 747", 600, 100000, new Engine(Size.L));
        Boat boat = new Boat("Sea Shanty", 70, 230102, new Engine(Size.S), true);
        Truck truck = new Truck("U-haul", 100, 81000, new Engine(Size.M));
        Drone drone = new Drone("Hi");
        FlyingCar flyingCar =  new FlyingCar("Flying Car",200,94299.21,new Engine(Size.M));
        List<Vehicle> list = new ArrayList<>();
        list.add(car);
        list.add(plane);
        list.add(boat);
        list.add(truck);
        list.add(flyingCar);
        VehicleApp.printListOfVehicleNames(list);

        //Step 2

        List<Flyable> s = new ArrayList<>();
        s.add(flyingCar);
        s.add(drone);
        s.add(plane);
        VehicleApp.printListOfFlyableObjects(s);

        //Step 3
        Map<Integer,String> passengerList = new HashMap<>();
        passengerList.put(57,"wesley snipes");
        passengerList.put(007, "james bond");
        VehicleApp.printPassengerNumbersOnly(passengerList);

        //Step 4
        VehicleApp.sortAndPrintDriveableVehiclesBySpeed(list);

        System.out.printf(car.formattedToString());


    }
}