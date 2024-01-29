public class Main {
    public static void main(String[] args) {

        House blueHouse = new House("blue");
        House anotherHouse = blueHouse;

        System.out.println(blueHouse.getColor()); // print blue
        System.out.println(anotherHouse.getColor()); // blue

        anotherHouse.setColor("yellow");
        System.out.println(blueHouse.getColor()); // yellow
        System.out.println(anotherHouse.getColor()); // yellow

        House greenHouse = new House("green");
        anotherHouse = greenHouse;

        System.out.println(blueHouse.getColor()); // yellow
        System.out.println(greenHouse.getColor()); // green
        System.out.println(anotherHouse.getColor()); // green

        new House("red");                   // house object gets created in memory
        House myHouse = new House("beige"); // house object gets created in memory
        // and it's location (reference) is
        // assigned to myHouse
        House redHouse = new House("red");  // house object gets created in memory
        // and it's location (reference) is
        // assigned to redHouse
    }
}
