/** @authors Eric Truong, Erina Lara
 * Date: February 18, 2020
 * Description: Subclass creates a Sundae child object that extends its parent, IceCream class, which extends
 * from the DessertItem class. A Sundae child object has a total price, price for topping, and a number of calories.
 *
 */

public class Sundae extends IceCream {

    /** total cost of ice cream + topping */
    private double price;
    /** cost for ice cream's topping */
    private double top;
    /** number of calories in ice cream*/
    private int cal;

    /** Constructs a Sundae child object with given name
     * @param n name of Sundae
     */
    public Sundae(String n) {
        super(n);
    }

    /** Constructs a Sundae child object with given name, topping price, and calories
     * @param n name of ice cream
     * @param t price of topping
     * @param c number of calories
     */
    public Sundae(String n, double t, int c) {
        super(n);
        top = t;
        cal = c;
    }

    /** Gets total cost of ice cream + topping
     * @return total cost of ice cream + topping
     */
    public double getCost(){
        return super.getCost() + top;
    }

    /** Returns a string of Sundae's name and total cost
     * @return Sundae's name and total cost
     */
    @Override
    public String toString(){

        return  String.format("%-40s%5.2f" , (name+" (Sundae)"), getCost());
    }

}
