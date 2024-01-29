public class LocalVariablesAndTheForStatement {
    public static void main(String[] args) {

        for (int i = 1; i < 5; i++) { // i is declared in for loop declaration
            System.out.println(i);
        }

//        System.out.println(i); // ERROR! Is out of scope
    }
}
