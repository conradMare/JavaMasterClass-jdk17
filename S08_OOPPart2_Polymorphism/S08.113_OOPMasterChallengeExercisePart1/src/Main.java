public class Main {
    public static void main(String[] args) {

        Item cocaCola = new Item("drink", "Coca-Cola", 1.50);
        cocaCola.printItem();
        cocaCola.setSize("LARGE");
        cocaCola.printItem();

        Item avocado = new Item("Topping", "avocado", 1.50);
        avocado.printItem();
    }
}
