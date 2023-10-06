package org.example;

public enum Size {
    S("SMALL"), M("MEDIUM"), L("LARGE");
    private final String size;

    Size(String size) {this.size=size;}
    public String getSize(){return size;}
}
