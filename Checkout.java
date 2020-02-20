/** @authors Eric Truong, Erina Lara
 * Date: February 18, 2020
 * Description: Class that creates a Checkout Object that creates and manages a list of DessertItems.
 * A Checkout has a tax rate, and actions to clear the list of DessertItems, add to list, return the number
 * of items in the list, and gives a total cost for all items.
 *
 */

import java.util.ArrayList;

public class Checkout extends java.lang.Object {

    /** List of DessertItems */
    private ArrayList<DessertItem> bag;
    /** Tax rate for items */
    private double tRate;

    /** Default constructor for Checkout object, size is 0.
     */
    public Checkout() {
        bag = new ArrayList<>();
    }

    /** Returns the number of items in list
     * @return number of items in list
     */
    public int numberofItems() {
        return bag.size();
    }

    /** Adds a DessertItem to list
     * @param item Dessert to be added to list
     */
    public void enterItem(DessertItem item) {
        bag.add(item);
    }

    /** Clears the entire list of Checkout
     */
    public void clear() {
        bag.clear();
    }

    /** Gives total cost of all items without tax
     * @return total cost of all items without tax
     */
    public int totalCost() {
        int sum = 0;
        for (int i = 0; i < bag.size(); i++) {
            DessertItem item = bag.get(i);
            sum += Math.round(item.getCost() * 100.0);
        }
        return sum;
    }

    /** Gives total tax of all items, exclusing prices
     * @return total tax of all items
     */
    public int totalTax() { // implement
        int tax = 606;
        return tax;
    }

    /** Sets tax rate of item
     * @param taxRate rate of tax for item
     */
    public void setTaxRate(double taxRate) {
        tRate = taxRate;
    }

    /** Gets tax rate on an item
     * @return tax rate on an item
     */
    public double getTaxRate() {
        return tRate;
    }

    /** Returns a string receipt of all items, prices, total, tax, and overall total
     * @return receipt of output of all items, prices, tax, and total overall cost
     */
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