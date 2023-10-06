package org.example;


import java.util.*;

public class VehicleApp {
    public static void printListOfVehicleNames(List<Vehicle> x){
        System.out.println("The list of Vehicles we have are");
        for (Vehicle vehicle : x) {
            System.out.println(vehicle.getName());
        }
    }
    public static void printListOfFlyableObjects(List<Flyable> x){
        System.out.println("The list of flying things include ");
        for (Flyable flying: x){
            System.out.println(flying.toString());
        }
    }
    public static void sortAndPrintDriveableVehiclesBySpeed(List<Vehicle> x){
        Comparator<Vehicle> speedComparator = new SpeedComparator();
        x.sort(speedComparator);
        Iterator<Vehicle> iterator = x.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
    public static void printPassengerNumbersOnly(Map<Integer,String> x){
        for(Map.Entry<Integer, String> list : x.entrySet()){
            System.out.println(list.getKey());
        }
    }
}
