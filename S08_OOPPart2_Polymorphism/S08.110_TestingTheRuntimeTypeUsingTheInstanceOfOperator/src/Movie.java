public class Movie {
    private String title;

    public Movie(String title) {
        this.title = title;
    }

    //    Method to demonstrate POLYMORPHISM:
    public void watchMovie() {

        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a " + instanceType + " film");
    }

    // !!! Take NOTE of below method !!! :
    public static Movie getMovie(String type, String title) {

        return switch (type.toUpperCase().charAt(0)) {
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S' -> new ScienceFiction(title);
            default -> new Movie(title);
        };
    }
}

class Adventure extends Movie {

    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Pleasant Scene",
                "Scary Scene",
                "Something Bad Happens");
//        %s = replaces a String
//        %n = new line
//        String is repeated 3 x times (.repeat(3)) - All the stage plots gets printed on its own line
    }

    public void watchAdventure() {
        System.out.println("Watching Adventure");
    }
}

class Comedy extends Movie {

    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Something funny happens",
                "Something even funnier happens",
                "Happy Ending");
    }

    public void watchComedy() {
        System.out.println("Watching a Comedy");
    }
}

class ScienceFiction extends Movie {

    public ScienceFiction(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Danger Close",
                "Soldiers Deploy",
                "We Shall Not Go Quietly Into The Night");
    }

    public void watchScienceFiction() {
        System.out.println("Watching ScienceFiction");
    }
}
