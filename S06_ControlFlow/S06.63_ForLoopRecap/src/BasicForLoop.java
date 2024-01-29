public class BasicForLoop {
    public static void main(String[] args) {

        for (int number = 1; number < 10; number += 2) {
            System.out.println("number = " + number);
        }
    }
}

// Value in init is more than condition = code returns 'NO OUTPUT' (condition = false):

//  for (int number = 1; number < 0; number += 2) {
//      System.out.println("number = " + number);
//  }

// Infinite loop:

//  for (int number = 100; number > 0; number += 10) {
//      System.out.println("number = " + number);
//  }
