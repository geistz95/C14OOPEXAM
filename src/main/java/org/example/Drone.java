package org.example;

public class Drone implements Flyable{
    private String name;
    public Drone(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean transportsPassengers() {
        return false;
    }

    @Override
    public String toString() {
        return "Drone{" +
                "name='" + name + '\'' +
                ", transportsPassengers=" + transportsPassengers() +
                '}';
    }
}
