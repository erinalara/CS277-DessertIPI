/** @authors Eric Truong, Erina Lara
 * Date: February 18, 2020
 * Purpose: Program creates a list of dessert items of Candy, Cookie, IceCream, and Sundae
 * that extend its parent class, DessertItems.
 */

import java.util.ArrayList;

public class Tester {

    public static void main (String[] args) {

        // Sample testing
        ArrayList<DessertItem> desserts = new ArrayList<>();
        ArrayList<DessertItem> desserts2 = new ArrayList<>();

        Checkout cart = new Checkout();

        desserts.add(new Candy("Corn", 1.5, 7.25, 500));
        desserts.add(new Candy("Lollipop", 2.5, 8.25, 640 ));
        desserts.add(new Cookie("Chocolate Chip", 17, 4.99, 250));
        desserts.add(new Cookie("Oatmeal", 15, 3.99, 240));
        desserts.add(new IceCream("Vanilla", 10.05, 500));
        desserts.add(new IceCream("Chocolate", 9.99, 500));
        desserts.add(new Sundae("Caramel", "HotFudge", 7.70, 600));
        desserts.add(new Sundae("Banana Split", "Strawberries", 6.90, 560));

        desserts2.add(new Candy("Lollipop", 2.5, 8.25, 640 ));
        desserts2.add(new Cookie("Oatmeal", 15, 3.99, 240));
        desserts2.add(new Sundae("Banana Split", "Strawberries", 6.90, 560));
        desserts2.add(new IceCream("Chocolate", 9.99, 500));
        desserts2.add(new Candy("Corn", 1.5, 7.25, 500));
        desserts2.add(new IceCream("Vanilla", 10.05, 500));
        desserts2.add(new Sundae("Caramel", "HotFudge", 7.70, 600));
        desserts2.add(new Cookie("Chocolate Chip", 17, 4.99, 250));

        cart.enterItem(new Candy("Corn", 1.5, 7.25, 500));
        cart.enterItem(new Candy("Lollipop", 2.5, 8.25, 640 ));
        cart.enterItem(new Cookie("Chocolate Chip", 17, 4.99, 250));
        cart.enterItem(new Cookie("Oatmeal", 15, 3.99, 240));
        cart.enterItem(new IceCream("Vanilla", 10.05, 500));
        cart.enterItem(new IceCream("Chocolate", 9.99, 500));
        cart.enterItem(new Sundae("Caramel", "HotFudge", 7.70, 600));
        cart.enterItem(new Sundae("Banana Split", "Strawberries",6.90, 560));
        cart.setTaxRate(75.75);

        // CANDY TEST
        System.out.println("CANDY TEST:");
        Candy noCan = new Candy();
        Candy corn = new Candy("Corn", 1.5, 7.25, 500);
        Candy lol = new Candy("Lollipop", 2.5, 8.25, 640 );
        System.out.println(noCan.toString());
        System.out.println(corn.toString() + '\n' +  corn.getName() + "calories: " + corn.getCal());
        System.out.println(lol.toString() + '\n' + lol.getName() + "calories: " + lol.getCal());

        // COOKIE TEST
        System.out.println();
        System.out.println("COOKIE TEST:");
        Cookie noCookie = new Cookie();
        Cookie ch = new Cookie("Chocolate Chip", 17, 4.99, 250);
        Cookie oat = new Cookie("Oatmeal", 15, 3.99, 240);
        System.out.println(noCookie.toString());
        System.out.println(ch.toString() + '\n' +  ch.getName() + "calories: " + ch.getCal());
        System.out.println(oat.toString() + '\n' + oat.getName() + "calories: " + oat.getCal());

        // ICECREAM TEST
        System.out.println();
        System.out.println("ICECREAM TEST:");
        IceCream noIce = new IceCream();
        IceCream va = new IceCream("Vanilla", 10.05, 500);
        IceCream cho = new IceCream("Chocolate", 9.99, 500);
        System.out.println(noIce.toString());
        System.out.println(va.toString() + '\n' +  va.getName() + "calories: " + va.getCal());
        System.out.println(cho.toString() + '\n' + cho.getName() + "calories: " + cho.getCal());

        // SUNDAE TEST
        System.out.println();
        System.out.println("SUNDAE TEST:");
        Sundae noSu = new Sundae();
        Sundae car = new Sundae("Caramel", "HotFudge", 7.70, 600);
        Sundae ba = new Sundae("Banana Split", "Strawberries",6.90, 560);
        System.out.println(noSu.toString());
        System.out.println(car.toString() + '\n' +  car.getName() + "calories: " + car.getCal());
        System.out.println(ba.toString() + '\n' + ba.getName() + "calories: " + ba.getCal());
        System.out.println();
        System.out.println("------------------------------------------------------------------");

        // OUTPUT RECEIPT
        System.out.println("OUTPUT RECEIPT: ");
        System.out.println();
        System.out.println("Number of items: " + cart.numberofItems());
        System.out.println("Total cost: " + cart.totalCost());
        System.out.println("Total tax: " + cart.totalTax());
        System.out.println("Cost + Tax: " + (cart.totalTax() + cart.totalCost()));
        System.out.println();
        System.out.println(cart.toString());
        System.out.println();

        // MAX WITH SAME OBJECTS
        System.out.println("MAX TEST WITH SAME TYPES: ");

        // For loop compare like objects' number of calories
        for (int i = 0; i < desserts.size()-1; i++) {
            DessertItem m = DessertItem.max(desserts.get(i), desserts.get(i+1));
            DessertItem n;
            int xCal = 0;
            int yCal = 0;

            // if max is first object
            if (m == desserts.get(i)) {
                n = desserts.get(i+1);
            }
            // if max is second object
            else {
                n = desserts.get(i);
            }
            // gets calories from objects
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

            } else if ((m instanceof Sundae) || (n instanceof Sundae)) {
                Sundae x = (Sundae) m;
                Sundae y = (Sundae) n;
                xCal = x.getCal();
                yCal = y.getCal();
            }
            // if the calories equal each other
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
        System.out.println();

        // MAX WITH DIFF OBJECTS
        // For loop coompares calories with different object types
        System.out.println("MAX TEST WITH DIFFERENT TYPES: ");

        for (int i = 0; i < desserts2.size()-1; i++) {
            DessertItem m = DessertItem.max(desserts2.get(i), desserts2.get(i+1));
            DessertItem n;
            int xCal = 0;
            int yCal = 0;

            // if max is the first object
            if (m == desserts2.get(i)) {
                n = desserts2.get(i+1);
            }
            // if max is second object
            else {
                n = desserts2.get(i);
            }
            // gets calories from first object compared
            if ((m instanceof Candy)) {
                Candy x = (Candy) m;
                xCal = x.getCal();

            } else if ((m instanceof Cookie)) {
                Cookie x = (Cookie) m;
                xCal = x.getCal();

            } else if ((m instanceof IceCream)) {
                IceCream x = (IceCream) m;
                xCal = x.getCal();

            } else if ((m instanceof Sundae)) {
                Sundae x = (Sundae) m;
                xCal = x.getCal();
            }
            // gets calories from second object compared

            if ((n instanceof Candy)) {
                Candy y = (Candy) n;
                yCal = y.getCal();

            } else if ((n instanceof Cookie)) {
                Cookie y = (Cookie) n;
                yCal = y.getCal();

            } else if ((n instanceof IceCream)) {
                IceCream y = (IceCream) n;
                yCal = y.getCal();

            } else if ((n instanceof Sundae)) {
                Sundae y = (Sundae) n;
                yCal = y.getCal();
            }
            // if objects' calories are equal
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
        System.out.println();

        // PRINTS UNSORTED LIST
        System.out.println("UNSORTED LIST: ");

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

        // SORTED LIST
        for (int i = 0; i < desserts.size(); i++){
            int checkHighest = 0;
            int checkLowest = 0;
            int lowest = i;
            // minimum, set to first item of list, changes as i incrememnts
            DessertItem nLowest = desserts.get(i);

            // compares second object with nLowest
            for (int j = i + 1; j < desserts.size(); j++){
                DessertItem checking = desserts.get(j);

                // retrieves calories of nLowest
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

                // retrieves calories of object to be compared
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

                // if next object's calories is smaller than current object's calories
                if ((checkHighest < checkLowest)){
                    lowest = desserts.indexOf(checking);
                    nLowest = desserts.get(desserts.indexOf(checking));
                }
            }
            // swaps and sets lowest item
            DessertItem swap = desserts.get(i);
            desserts.set(i, desserts.get(lowest));
            desserts.set(lowest, swap);
        }

        // Prints sorted list
        System.out.println();
        System.out.println("SORTED LIST: ");
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
