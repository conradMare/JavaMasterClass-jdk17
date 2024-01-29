public class Main {
    public static void main(String[] args) {

//        Call to Static method (a) -> in different class, (b) in same class:
//        NOTE -> call to printSum method in main = ClassName.methodName();
//        (a):
        Calculator_StaticMethodExample.printSum(1, 2, 3);

//        NOTE -> method in same class is called = methodName();
//        (b):
        printHello();

        System.out.println();

        // Call to Instance Method:
        Dog_InstanceMethodExample rex = new Dog_InstanceMethodExample(); // create instance
        rex.bark(); // call instance method
    }

    //    (b) STATIC METHOD IN SAME CLASS:
    public static void printHello() {
        System.out.println("Hello");
    }
}
