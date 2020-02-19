import java.util.ArrayList;

public class Tester {

    public static void main (String[] args) {

        ArrayList<DessertItem> desserts = new ArrayList<>();

        desserts.add(new Candy("Corn", 1.5, 7.25, 500));
        desserts.add(new Candy("Lollipop", 2.5, 8.25, 640 ));
        desserts.add(new Cookie("Chocolate Chip", 17, 4.99, 250));
        desserts.add(new Cookie("Oatmeal", 15, 3.99, 240));
        desserts.add(new IceCream("Vanilla", 10.05, 500));
        desserts.add(new IceCream("Chocolate", 9.99, 500));
        desserts.add(new Sundae("Caramel", 7.70, 600));
        desserts.add(new Sundae("Strawberry", 6.90, 560));

        for (int i = 0; i < desserts.size(); i++) {
            DessertItem tester = desserts.get(i);
            System.out.println(tester);
        }
    }
}
