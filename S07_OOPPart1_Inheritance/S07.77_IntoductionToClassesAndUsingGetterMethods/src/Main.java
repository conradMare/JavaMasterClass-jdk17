public class Main {
    public static void main(String[] args) {

//      NOTE: 'new' = new instance
        Car car = new Car();

//      Can't use 'car.make', because of private access modifier in 'Car.java':
//      car.make = "Porsche";
//      car.model = "Carrera";
//      car.color = "Red";

        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());

        car.describeCar();
    }
}
