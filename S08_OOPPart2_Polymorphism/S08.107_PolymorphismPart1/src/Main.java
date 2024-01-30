public class Main {
    public static void main(String[] args) {

//        Movie theMovie = new Movie("Star Wars");
//        theMovie.watchMovie();

        Movie theMovie = new Adventure("Star Wars");
        theMovie.watchMovie();

        Movie theMovie2 = new Comedy("Me, Myself and Irene");
        theMovie2.watchMovie();

        Movie theMovie3 = new ScienceFiction("Independence Day");
        theMovie3.watchMovie();
    }
}
