import java.util.ArrayList;

public class Tester {

    public static void main (String[] args) {

        ArrayList<DessertItem> desserts = new ArrayList<>();
        Checkout cart = new Checkout();


        cart.enterItem(new Candy("Corn", 1.5, 7.25, 500));
        cart.enterItem(new Candy("Lollipop", 2.5, 8.25, 640 ));
        cart.enterItem(new Cookie("Chocolate Chip", 17, 4.99, 250));
        cart.enterItem(new Cookie("Oatmeal", 15, 3.99, 240));
        cart.enterItem(new IceCream("Vanilla", 10.05, 500));
        cart.enterItem(new IceCream("Chocolate", 9.99, 500));
        cart.enterItem(new Sundae("Caramel", 7.70, 600));
        cart.enterItem(new Sundae("Strawberry", 6.90, 560));

        System.out.println(cart.numberofItems());
        System.out.println(cart.toString());

        /*for (int i = 0; i < desserts.size(); i++) {
            DessertItem tester = desserts.get(i);
            System.out.println(tester);
            System.out.println();
        }*/

    }
}
