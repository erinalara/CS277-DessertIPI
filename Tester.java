import java.util.ArrayList;

public class Tester {

    public static void main (String[] args) {

        ArrayList<DessertItem> desserts = new ArrayList<>();

        desserts.add(new Candy("Corn", 1.2, 0.89, 100));
        //desserts.add(new Candy("Lolipop", 2.5));

        for (int i = 0; i < desserts.size(); i++) {
            DessertItem tester = desserts.get(i);

            System.out.println(tester);
        }
    }
}
