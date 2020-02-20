/** @authors Eric Truong, Erina Lara
 * Date: February 18. 2020
 * Purpose:
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

    static DessertItem max (DessertItem a, DessertItem b) {
        if (b.compareTo(a) > a.compareTo(b)) {
            return b;
        }
        else {
            return a;
        }
    }

    /**
     * Returns cost of DessertItem
     *
     * @return cost of DessertItem
     */
    public abstract double getCost();

    abstract DessertItem getMax(Object o);

}


