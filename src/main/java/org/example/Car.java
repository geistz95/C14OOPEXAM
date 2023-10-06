package org.example;

public class Car extends Vehicle implements Driveable{
    private int numDoors;
    private float extraTax=.05f;
    private float totalTax=extraTax+TAX_AMT;

    public Car(String name, int speed, double price, Engine engine) {
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
        return (1+totalTax)*getPrice();
    }

    public String toString() {
        return String.format("This is a car that has a speed of %d priced at %.2f taxed at %.2f total price of %.2f", getSpeed(), getPrice(), totalTax, getPriceAfterDiscounts());
    }

}
