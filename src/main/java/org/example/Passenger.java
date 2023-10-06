package org.example;

import java.util.HashMap;

public class Passenger {
    public HashMap<Integer,String> info;
    public Passenger(HashMap<Integer,String> info){
        this.info=info;
    }

    public HashMap<Integer, String> getInfo() {
        return info;
    }

    public void setInfo(HashMap<Integer, String> info) {
        this.info = info;
    }
}
