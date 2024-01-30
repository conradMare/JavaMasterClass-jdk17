public class Main {
    public static void main(String[] args) {

        Car car = new Car("2023 Alfa-Rome GTA");
        runRace(car);

        Car lamborghini = new GasPoweredCar("2023 Lamborghini Aventadore",
                12.1, 12);
        runRace(lamborghini);
    }

    public static void runRace(Car car) {

        car.startEngine();
        car.drive();
    }
}
