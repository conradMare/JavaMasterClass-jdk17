package dev.lpa;

interface FlightEnabled {

//    public abstract void takeOff();
    // public and abstract modifiers are redundant,
    // meaning unnecessary to declare

    void takeOff();

//    abstract void land();
    // abstract modifier is redundant, meaning
    // unnecessary

    void land();

    void fly();
    // This is the PREFERRED declaration,
    // public and abstract are implied
}

interface Trackable {

    void track();
}

public abstract class Animal {

    public abstract void move();
}