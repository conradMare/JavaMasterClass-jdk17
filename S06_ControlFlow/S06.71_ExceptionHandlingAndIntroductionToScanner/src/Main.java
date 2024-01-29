import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int currentYear = 2024;

        try {
            System.out.println(getInputFromConsole(currentYear));
        } catch (NullPointerException e) {
            System.out.println(getInputFromScanner(currentYear));
        }
    }

    public static String getInputFromConsole(int currentYear) {

        String name = System.console().readLine("Hi, What's your Name? ");
        System.out.println("Hi " + name + ", Thanks for taking the course!");

        String dateOfBirth = System.console().readLine("What year were you born? ");
        int age = currentYear - Integer.parseInt(dateOfBirth);

        return "So you are " + age + " years old" + name;
    }

    public static String getInputFromScanner(int currentYear) {

        Scanner scannerParameter = new Scanner(System.in);

//        String name = System.console().readLine("Hi, What's your Name? ");
        System.out.println("Hi, what is your name?");
        String name = scannerParameter.nextLine();
        System.out.println("Welcome " + name + "!");

//        String dateOfBirth = System.console().readLine("What year were you born?");
        System.out.println("What year were you born?");
        String dateOfBirth = scannerParameter.nextLine();
        int age = currentYear - Integer.parseInt(dateOfBirth);

        return name + ", you are " + age + " years old... ";
    }
}
