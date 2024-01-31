package dev.lpa;

public abstract class Animal {

    protected String type;
    private String size;
    private double weight;

    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    //    NOTE: After abstract method = semicolon & abstract method CAN'T be private...
    public abstract void move(String speed);

    public abstract void makeNoise();
}
