package org.example;

public class FlyingCar extends Vehicle implements Driveable,Flyable{
    public FlyingCar(String name, int speed, double price, Engine engine) {
        super(name, speed, price, engine);
    }


    public void printSpeed() {
        System.out.printf("The speed of %s is %d\n", getClass(), getSpeed());
    }

    @Override
    public void printVehicleType() {
        System.out.printf("The type of this vehicle is %s\n", getClass());
    }
    @Override
    public boolean transportsPassengers() {
        return true;
    }


    @Override
    public float getPriceAfterTax() {
        return (1+TAX_AMT)*getPrice();
    }

    public String getFormattedPriceAfterTax(){
        return String.format(".2f", getPriceAfterTax());
    }


    @Override
    public String toString() {
        return String.format(
                "FlyingCar{transportsPassengers=" + transportsPassengers() +
                ", priceAfterDiscounts= %.2f" +
                ", speed="+getSpeed()+
                ", engine=Engine "+getEngine().getSize()+
                ", TAX_AMT="+getTAX_AMT()+
                '}', getPriceAfterTax());
    }
}
