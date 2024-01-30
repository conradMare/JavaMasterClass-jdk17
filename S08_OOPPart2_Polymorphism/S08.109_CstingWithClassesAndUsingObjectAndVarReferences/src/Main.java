import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Movie theMovie0 = new Movie("Edge of Tomorrow");
//        theMovie0.watchMovie();
//
//        Movie theMovie1 = new Adventure("Star Wars");
//        theMovie1.watchMovie();
//
//        Movie theMovie2 = new Comedy("Me, Myself and Irene");
//        theMovie2.watchMovie();
//
//        Movie theMovie3 = new ScienceFiction("Independence Day");
//        theMovie3.watchMovie();

//

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter movie type (A for Adventure, C for Comedy, " +
                    "S for Science Fiction, or Q to Quit): ");

            String type = sc.nextLine();

//            Tests to see if what user entered contains Q or q... if true, break out of the loop
            if ("Qq".contains(type)) {
                break;
            }

            System.out.print("Enter Movie Title: ");

            String title = sc.nextLine();

            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }
    }
}
