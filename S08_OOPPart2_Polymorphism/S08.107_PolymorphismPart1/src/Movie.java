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
}
