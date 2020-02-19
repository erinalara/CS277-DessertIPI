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

    public int totalCost() {
        int sum = 0;
        for (int i = 0; i < bag.size(); i++) {
            DessertItem item = bag.get(i);
            sum += item.getCost();
        }
        return sum;
    }

    public int totalTax() { // implement
        int tax = 0;
        return tax;
    }

    @Override
    public String toString() {
        String receipt = "";
        receipt += "    EE! Desserts of Disneyland!     " + '\n' + "    - - - - - - - - - - - - - -      " + '\n';
        for (int i = 0; i < bag.size(); i++) {
            DessertItem tester = bag.get(i);
            receipt += tester;
            receipt += '\n';
        }

        receipt += " Tax:       " + totalTax() + '\n' + "Total cost:        " + totalCost();
        return receipt;
    }
}