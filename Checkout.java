import java.util.ArrayList;


public class Checkout {

    private ArrayList<DessertItem> bag;

    public Checkout() {
        bag = new ArrayList<>();
    }

    public int numberofItems() {
        return bag.size();
    }

    public void enterItem(DessertItem item) {
        bag.add(item);
    }

    public void clear() {
        bag.clear();
    }

    public double totalCost() {
        double sum = 0;
        for (int i = 0; i < bag.size(); i++) {
            DessertItem item = bag.get(i);
            sum += Math.round(item.getCost() * 100.0) / 100.0 ;
            sum = Math.round(sum*100.0) / 100.0;

        }
        return sum;
    }

    public double totalTax() { // implement
        double tax = 6.06;
        return tax;
    }

    @Override
    public String toString() {
        String receipt = "";
        receipt += "\t\t\t EE! Desserts Shop!" + '\n' + "\t\t  - - - - - - - - - - - -" + '\n';
        for (int i = 0; i < bag.size(); i++) {
            DessertItem tester = bag.get(i);
            receipt += tester;
            receipt += '\n';
        }

        receipt += '\n' + String.format("%4s%40.2f%n%-25s%20.2f", "Tax: ", totalTax(), "Total cost: ", (totalCost()+totalTax()));
        return receipt;
    }
}