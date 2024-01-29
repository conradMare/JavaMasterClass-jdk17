public class Main {
    public static void main(String[] args) {

//        (a):
//        System.out.println(Dog.genus);
//        An instance isn't required to access a static variable!

//        (b):
//        Dog rex = new Dog("rex");   // create instance (rex)
//        Dog fluffy = new Dog("fluffy"); // create instance (fluffy)
//        rex.printName();    // prints fluffy
//        fluffy.printName(); // prints fluffy
//        Prints "fluffy" twice because STATIC VARIABLES ARE SHARED instances.

//       (c):
        Dog rex = new Dog("rex");   // create instance (rex)
        Dog fluffy = new Dog("fluffy"); // create instance (fluffy)
        rex.printName();    // prints rex
        fluffy.printName(); // prints fluffy
//      Prints "rex" & "fluffy" because instance variable in Dog.java isn't static!
    }
}
