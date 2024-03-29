public class Main {
    public static void main(String[] args) {

        System.out.println("First test case : " + getDurationString(-3945));
        System.out.println("Second test case : " + getDurationString(-65, 45));
        System.out.println("Third test case : " + getDurationString(65, 145));
        System.out.println("Fourth test case : " + getDurationString(65, 45));
        System.out.println("Fifth test case : " + getDurationString(3945));
    }

    public static String getDurationString(int seconds) {

        if (seconds < 0) {
            return "Invalid data for seconds(" + seconds
                    + "), must be a positive integer value";
        }

        return getDurationString(seconds / 60, seconds % 60);
    }

    public static String getDurationString(int minutes, int seconds) {

        if (minutes < 0) {
            return "Invalid data for minutes(" + minutes
                    + "), must be a positive integer value";
        }

        if (seconds <= 0 || seconds >= 59) {
            return "Invalid data for seconds(" + seconds
                    + "), must be between 0 and 59";
        }

        int hours = minutes / 60;

        int remainingMinutes = minutes % 60;
        int remainingSeconds = seconds % 60;

        return hours + "hours " + remainingMinutes + "minutes " + seconds + "seconds";
    }
}