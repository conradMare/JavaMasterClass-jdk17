package dev.lpa;

public class Park extends Point {
    private String name;

    // NOTE: parameter 'location' moved to 2nd parameter from 1st...
    // Class is being duplicated to another(in effect there -- River.java)
    public Park(String name, String location) {
        super(location);
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " National Park";
    }
}
