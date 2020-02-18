import java.util.ArrayList;

public class Tester {

    public static void main (String[] args) {

        ArrayList<DessertItem> desserts = new ArrayList<>();

        desserts.add(new Candy("Corn", 1.2, 7.25, 10));
        desserts.add(new Candy("Lollipop", 2.5, 8.25, 60));

        desserts.add(new Cookie("Chocolate Chip", 6, 3.99, 300));
        desserts.add(new Cookie("Red Velvet", 39, 4.99, 550));

        desserts.add(new IceCream("Vanilla", 9.99, 0.1, 500));
        desserts.add(new IceCream("Chocolate", 10.99, 0.1, 510));

        for (int i = 0; i < desserts.size(); i++) {
            DessertItem tester = desserts.get(i);

            System.out.println(tester + "\n");
        }
    }
}
