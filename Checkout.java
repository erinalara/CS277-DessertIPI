import java.util.ArrayList;

public class Checkout extends java.lang.Object {

    private ArrayList<DessertItem> bag;
    private double tRate;

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

    public int totalCost() {
        int sum = 0;
        for (int i = 0; i < bag.size(); i++) {
            DessertItem item = bag.get(i);
            sum += Math.round(item.getCost() * 100.0);
        }
        return sum;
    }

    public int totalTax() { // implement
        int tax = 606;
        return tax;
    }

    public void setTaxRate(double taxRate) {
        tRate = taxRate;
    }

    public double getTaxRate() {
        return tRate;
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
        receipt += '\n' + String.format("%4s%40.2f%n%-25s%20.2f", "Tax: ", totalTax()*.01, "Total cost: ", ((totalCost()+totalTax())*.01));
        return receipt;
    }
}