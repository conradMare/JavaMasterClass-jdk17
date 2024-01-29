public class Dog {

//    (a) NOTE -> 'static' instance variable:
//    static String genus = "Canis";
//
//    void printData() {
//
//        Dog d = new Dog();
//        System.out.println(d.genus); // Confusing!
//        System.out.println(Dog.genus); // Clearer!
//    }

//    (b) NOTE -> 'private static' instance variable:
//    private static String name;
//
//    public Dog(String name) {
//        Dog.name = name;
//    }
//
//    public void printName() {
//        System.out.println("name = " + name); // Using Dog.name would have made this code less confusing.
//    }

    //    (c) NOTE -> 'private' instance variable:
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("name = " + name);
    }
}
