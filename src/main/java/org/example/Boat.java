package org.example;

public class Boat extends Vehicle implements Driveable{
    private boolean hasGPS;
    public Boat(String name, int speed, double price, Engine engine, boolean hasGPS) {
        super(name, speed, price, engine);
        this.hasGPS=hasGPS;
    }

    public boolean isHasGPS() {
        return hasGPS;
    }

    public void setHasGPS(boolean hasGPS) {
        this.hasGPS = hasGPS;
    }

    @Override
    public void printSpeed() {
        System.out.printf("The speed of %s is %d\n", getClass(), getSpeed());
    }

    @Override
    public void printVehicleType() {
        System.out.printf("The type of this vehicle is %s \n", getClass());
    }

    @Override
    public float getPriceAfterTax() {
        return (1+TAX_AMT)*getPrice();
    }
    public String toString(){
        return String.format("This is a boat that has a speed of %d priced at %.2f taxed at %.2f total price of %.2f", getSpeed(), getPrice(), TAX_AMT, getPriceAfterTax());
    }

}
