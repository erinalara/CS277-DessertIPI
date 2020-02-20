/** @authors Eric Truong, Erina Lara
 * Date: February 18, 2020
 * Purpose: Program creates a list of dessert items of Candy, Cookie, IceCream, and Sundae
 * that extend its parent class, DessertItems.
 */

public class Sundae extends IceCream {

    /** total cost of ice cream + topping */
    private double price;
    /** cost for ice cream's topping */
    private double top;
    /** number of calories in ice cream*/
    private int cal;
    /** topping for ice cream */
    private String t;

    /** Constructs a Sundae child object with given name
     */
    public Sundae() {
        super();
        top = 0.0;
        t = "";
        cal = 0;
        price = 0.0;
    }

    /** Constructs a Sundae child object with given name, topping price, and calories
     * @param n name of ice cream
     * @param s name of topping
     * @param to price of topping
     * @param c number of calories
     */
    public Sundae(String n, String s, double to, int c) {
        super(n + " (Sundae) ");
        t = s;
        top = to;
        cal = c;
    }

    /** Gets total cost of ice cream + topping
     * @return total cost of ice cream + topping
     */
    public double getCost(){
        return super.getCost() + top;
    }

    /** Sets number of calories for sundae
     * @param c number of calories for sundae
     * @return true if number of calories was successfully set, false if not
     */
    public boolean setCal(int c) {
        if (c != 0){
            cal = c;
            return true;
        }
        return false;
    }

    /** Gets number of calories of sundae
     * @return sundae's number of sundae
     */
    public int getCal() {
        return cal;
    }

    /** Compares the calories of two sundaes
     * @param o Sundae  to be compared with
     * @return the difference of the two sundae's calories
     */
    public int compareTo(Object o){

        if (o instanceof Sundae){

            Sundae f = (Sundae) o;

            return this.getCal() - f.getCal();
        }

        return 0;
    }

    /** Returns a string of Sundae's name and total cost
     * @return Sundae's name and total cost
     */
    @Override
    public String toString(){
        return String.format("%-20s%n%-40s%5.2f" , (name+"with"), (t + "(Topping) "), getCost());
    }
}