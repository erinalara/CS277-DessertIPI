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

        System.out.println();

        for (int i = 0; i < desserts.size()-1; i++) {
            DessertItem m = DessertItem.max(desserts.get(i), desserts.get(i+1));
            DessertItem n;
            int xCal = 0;
            int yCal = 0;

            if (m == desserts.get(i)) {
                n = desserts.get(i+1);
            }
            else {
                n = desserts.get(i);
            }

            if ((m instanceof Candy) || (n instanceof Candy)) {
                Candy x = (Candy) m;
                Candy y = (Candy) n;
                xCal = x.getCal();
                yCal = y.getCal();

            } else if ((m instanceof Cookie) || (n instanceof Cookie)) {
                Cookie x = (Cookie) m;
                Cookie y = (Cookie) n;
                xCal = x.getCal();
                yCal = y.getCal();

            } else if ((m instanceof IceCream) || (n instanceof IceCream)) {
                IceCream x = (IceCream) m;
                IceCream y = (IceCream) n;
                xCal = x.getCal();
                yCal = y.getCal();


            } else if ((m instanceof IceCream) || (n instanceof IceCream)) {
                Sundae x = (Sundae) m;
                Sundae y = (Sundae) n;
                xCal = x.getCal();
                yCal = y.getCal();
            }
            if (xCal == yCal) {
                System.out.println(m.getName() + " with " +xCal + " calories is equal to "
                        + n.getName() + " that has " +yCal + " calories.");
            }
            else {
                System.out.println(m.getName() + " with " + xCal + " calories has more calories than "
                        + n.getName() + " that has " + yCal + " calories.");
            }
            i++;
        }

        for (int i = 0; i < desserts.size(); i++){

            int checkHighest = 0;
            int checkLowest = 0;

            int lowest = i;

            DessertItem nLowest = desserts.get(i);

            for (int j = i + 1; j < desserts.size(); j++){

                DessertItem checking = desserts.get(j);

                if (nLowest instanceof Candy){

                    Candy a = (Candy) nLowest;

                    checkLowest = a.getCal();
                }

                else if (nLowest instanceof Cookie){

                    Cookie a = (Cookie) nLowest;

                    checkLowest = a.getCal();
                }

                else if (nLowest instanceof IceCream){

                    IceCream a = (IceCream) nLowest;

                    checkLowest = a.getCal();
                }

                else if (nLowest instanceof Sundae){

                    Sundae a = (Sundae) nLowest;

                    checkLowest = a.getCal();
                }

                if (checking instanceof Candy){

                    Candy a = (Candy) checking;

                    checkHighest = a.getCal();
                }

                else if (checking instanceof Cookie){

                    Cookie a = (Cookie) checking;

                    checkHighest = a.getCal();
                }

                else if (checking instanceof IceCream){

                    IceCream a = (IceCream) checking;

                    checkHighest = a.getCal();
                }

                else if (checking instanceof Sundae){

                    Sundae a = (Sundae) checking;

                    checkHighest = a.getCal();
                }

                if ((checkHighest - checkLowest) < 0){

                    lowest = j;
                }
            }

            DessertItem swap = desserts.get(lowest);
            desserts.set(i, desserts.get(lowest));
            desserts.set(lowest, swap);
        }

        for (int i = 0; i < desserts.size(); i++){

            DessertItem select = desserts.get(i);

            if (select instanceof Candy){

                Candy toPrint = (Candy) select;

                System.out.println(toPrint.getName() + " has " + toPrint.getCal() + " calories");
            }

            else if (select instanceof Cookie){

                Cookie toPrint = (Cookie) select;

                System.out.println(toPrint.getName() + " has " + toPrint.getCal() + " calories");
            }

            else if (select instanceof IceCream){

                IceCream toPrint = (IceCream) select;

                System.out.println(toPrint.getName() + " has " + toPrint.getCal() + " calories");
            }

            else if (select instanceof Sundae){

                Sundae toPrint = (Sundae) select;

                System.out.println(toPrint.getName() + " has " + toPrint.getCal() + " calories");
            }
        }
    }
}
