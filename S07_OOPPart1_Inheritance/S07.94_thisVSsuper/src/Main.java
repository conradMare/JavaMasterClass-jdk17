public class Main {
    public static void main(String[] args) {

        SubClass s = new SubClass();
        s.printMethod();

        House colorHouse = new House("White");
        System.out.println(colorHouse.getColor());

        Rectangle newRectangle = new Rectangle(5, 5, 7, 9);
        System.out.println(newRectangle);
    }
}
