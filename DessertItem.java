/** @authors Eric Truong, Erina Lara
 * Date: February 18. 2020
 * Purpose: Create a list of dessert items of Candy, Cookie, IceCream, and Sundae
 * that extend its parent class, DessertItems. Program outputs a sample receipt, and tests each subclass.
 *
 */

import java.lang.Comparable;

public abstract class DessertItem implements Comparable {

    protected String name;

    /**
     * Null constructor for DessertItem class
     */
    public DessertItem() {
        this("");
    }

    /**
     * Initializes DessertItem data
     */
    public DessertItem(String name) {
        this.name = name;
    }

    /**
     * Returns name of DessertItem
     *
     * @return name of DessertItem
     */
    public final String getName() {
        return name;
    }

    /** Finds the larger object of the two desserts, based on calories
     * @param a dessert item to be compared
     * @param b second dessert item to be compared
     * @return larger dessert item with more calories
     */
    public static DessertItem max(DessertItem a, DessertItem b) {
        if (b.compareTo(a) > a.compareTo(b)) {
            return b;
        }
        else {
            return a;
        }
    }

    /**Returns cost of DessertItem
     * @return cost of DessertItem
     */
    public abstract double getCost();
}