package org.example;

public class Truck extends Vehicle implements Driveable{
    public Truck(String name, int speed, double price, Engine engine) {
        super(name, speed, price, engine);
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
    public float getPriceAfterDiscounts() {
        return (1+TAX_AMT)*getPrice();
    }
    public String toString(){
        return String.format("This is a truck that has a speed of %d priced at %.2f taxed at %.2f total price of %.2f",  getSpeed(), getPrice(), TAX_AMT, getPriceAfterDiscounts());
    }

}
