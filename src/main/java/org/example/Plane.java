package org.example;

public class Plane extends Vehicle implements Flyable{
    public Plane(String name, int speed, double price, Engine engine) {
        super(name, speed, price, engine);
    }

    @Override
    public void printVehicleType() {
    }
    @Override
    public float getPriceAfterDiscounts() {
        return (1+TAX_AMT)*getPrice();
    }

    @Override
    public boolean transportsPassengers() {
        return true;
    }

    @Override
    public String toString() {
        return String.format("Plane{" +
                "transportsPassengers=" + transportsPassengers() +
                ", priceAfterDiscounts=%.2f" +
                ", speed="+getSpeed()+
                ", engine=Engine"+getEngine().getSize()+
                ", TAX_AMT"+getTAX_AMT()+
                '}',getPriceAfterDiscounts() );
    }

}
