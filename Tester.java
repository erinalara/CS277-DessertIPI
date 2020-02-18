import java.util.ArrayList;

public class Tester {

    public static void main (String[] args){

        ArrayList<DessertItem> desserts = new ArrayList<>();

        desserts.add(new Candy("Corn", 1.5));

        DessertItem tester = desserts.get(0);

        System.out.println(tester);
    }
}
