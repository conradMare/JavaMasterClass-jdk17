// The keyword "this" is, commonly used with
// constructors and setters, and optionally used in getters.

public class House {
    private String color;

    public House(String color) {
        // this keyword is required, same parameter name as field
        this.color = color;
    }

    public String getColor() {
        // this is optional
        return color;
    }

    public void setColor(String color) {
        //this keyword is required, same parameter name as field
        this.color = color;
    }
}
