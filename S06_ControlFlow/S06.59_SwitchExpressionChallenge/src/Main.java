public class Main {
    public static void main(String[] args) {

        System.out.println("Switch Expression Challenge :");
        System.out.println("<==================>");
        printDayOfWeek(0);
        printDayOfWeek(1);
        printDayOfWeek(2);
        printDayOfWeek(3);
        printDayOfWeek(4);
        printDayOfWeek(5);
        printDayOfWeek(6);
        printDayOfWeek(7);

        System.out.println("");

        System.out.println("Switch Expression Challenge - BONUS (if-else) :");
        System.out.println("<==================>");
        printWeekDay(0);
        printWeekDay(1);
        printWeekDay(2);
        printWeekDay(3);
        printWeekDay(4);
        printWeekDay(5);
        printWeekDay(6);
        printWeekDay(7);
    }

    public static void printDayOfWeek(int day) {

        String dayOfWeek = switch (day) {
            case 0 -> {
                yield "Sunday";
            }
            case 1 -> "Monday";
            case 2 -> {
                yield "Tuesday";
            }
            case 3 -> "Wednesday";
            case 4 -> {
                yield "Thursday";
            }
            case 5 -> "Friday";
            case 6 -> {
                yield "Saturday";
            }
            default -> "Invalid day";
        };

        System.out.println(day + " stands for " + dayOfWeek);
    }

    // Bonus ( if - else statement )

    public static void printWeekDay(int day) {

        String dayOfWeek = "Invalid Day";
        if (day == 0) {
            dayOfWeek = "Sunday";
        } else if (day == 1) {
            dayOfWeek = "Monday";
        } else if (day == 2) {
            dayOfWeek = "Tuesday";
        } else if (day == 3) {
            dayOfWeek = "Wednesday";
        } else if (day == 4) {
            dayOfWeek = "Thursday";
        } else if (day == 5) {
            dayOfWeek = "Friday";
        } else if (day == 6) {
            dayOfWeek = "Saturday";
        }

        System.out.println(day + " stands for " + dayOfWeek);
    }
}
