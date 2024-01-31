package dev.lpa;

public class River extends Line {
    private String name;

    // NOTE: varargs for multiple locations in 2nd parameter.
    public River(String name, String... locations) {
        super(locations);
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " River";
    }
}
