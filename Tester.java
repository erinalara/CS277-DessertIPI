import java.util.ArrayList;

public class Tester {

    public static void main (String[] args) {

        ArrayList<DessertItem> desserts = new ArrayList<>();
        Checkout cart = new Checkout();

        desserts.add(new Candy("Corn", 1.5, 7.25, 500));
        desserts.add(new Candy("Lollipop", 2.5, 8.25, 640 ));
        desserts.add(new Cookie("Chocolate Chip", 17, 4.99, 250));
        desserts.add(new Cookie("Oatmeal", 15, 3.99, 240));
        desserts.add(new IceCream("Vanilla", 10.05, 500));
        desserts.add(new IceCream("Chocolate", 9.99, 500));
        desserts.add(new Sundae("Caramel", "HotFudge", 7.70, 600));
        desserts.add(new Sundae("Banana Split", "Strawberries", 6.90, 560));

        cart.enterItem(new Candy("Corn", 1.5, 7.25, 500));
        cart.enterItem(new Candy("Lollipop", 2.5, 8.25, 640 ));
        cart.enterItem(new Cookie("Chocolate Chip", 17, 4.99, 250));
        cart.enterItem(new Cookie("Oatmeal", 15, 3.99, 240));
        cart.enterItem(new IceCream("Vanilla", 10.05, 500));
        cart.enterItem(new IceCream("Chocolate", 9.99, 500));
        cart.enterItem(new Sundae("Caramel", "HotFudge", 7.70, 600));
        cart.enterItem(new Sundae("Banana Split", "Strawberries",6.90, 560));

        System.out.println("Number of items: " + cart.numberofItems());
        System.out.println("Total cost: " + cart.totalCost());
        System.out.println("Total tax: " + cart.totalTax());
        System.out.println("Cost + Tax: " + (cart.totalTax() + cart.totalCost()));
        System.out.println();
        System.out.println(cart.toString());

        DessertItem m = DessertItem.max(desserts.get(0),desserts.get(1));
        if (m instanceof Candy) {
            Candy x = (Candy) m;
            System.out.println(m.getName() + " has " + x.getCal());
        }
        else if (m instanceof Cookie) {
            Cookie x = (Cookie) m;
            System.out.println(m.getName() + " has " + x.getCal());
        }
        else if (m instanceof IceCream) {
            IceCream x = (IceCream) m;
            System.out.println(m.getName() + " has " + x.getCal());
        }
        else if (m instanceof Sundae) {
            Sundae x = (Sundae) m;
            System.out.println(m.getName() + " has " + x.getCal());
        }


    }
}
