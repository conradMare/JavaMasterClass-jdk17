public class Main {
    public static void main(String[] args) {

        Car car = new Car("2023 Alfa-Romeo GTA");
        runRace(car);

        Car lamborghini = new GasPoweredCar("2023 Lamborghini Aventadore",
                12.1, 12);
        runRace(lamborghini);

        Car tesla = new ElectricCar("2023 Red Tesla Model 3",
                568, 75);
        runRace(tesla);

        Car ferrariHybrid = new HybridCar("2022 Black Ferrari Stradale",
                16, 8, 8);
        runRace(ferrariHybrid);
    }

    public static void runRace(Car car) {

        car.startEngine();
        car.drive();
    }
}
