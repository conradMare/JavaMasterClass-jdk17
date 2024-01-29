public class LocalVariablesInASwitchStatement {
    public static void main(String[] args) {

        aMethod(5);
    }

//    public static void aMethod(int counter) {
//        int i = 10;
//    } else {
//        System.out.println(i); // ERROR: i is outside of scope
//    }
//
//    System.out.println(i); // ERROR: i is outside of scope


    //    HOWEVER, THE SWITCH STATEMENT IS DIFFERENT :
    public static void aMethod(int value) {

        switch (value) {

            case 1:
                int i = 10;
                break;

            default:
                i = value;                  // this is ok
                System.out.println(i);      // this is ok
                break;
        }

        // System.out.println(i);      // ERROR: i is outside of the block
    }
}
