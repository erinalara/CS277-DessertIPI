/** @authors Eric Truong, Erina Lara
 * Date: February 18, 2020
 * Purpose: Program creates a list of dessert items of Candy, Cookie, IceCream, and Sundae
 * that extend its parent class, DessertItems.
 */

public class IceCream extends DessertItem{

    /** price for ice cream*/
    private double price;
    /** number of calories of the ice cream*/
    private int cal;

    /** Constructs an IceCream object with the given name
     */
    public IceCream(){
        super();
        price = 0.0;
        cal = 0;
    }

    public IceCream(String n){
        super(n);
        price = 0.0;
        cal = 0;
    }

    /** Constructs an IceCream object with given name, price, and calories
     * @param n name of ice cream
     * @param p price of ice cream
     * @param c calories of ice cream
     */
    public IceCream(String n, double p, int c){
        super(n + " (Ice Cream)");
        price = p;
        cal = c;
    }

    /** Sets number of calories for ice cream
     * @param c number of calories for ice cream
     * @return true if number of calories was successfully set, false if not
     */
    public boolean setCal(int c) {
        if (c != 0){
            cal = c;
            return true;
        }
        return false;
    }

    public int getCal(){

        return cal;
    }

    /** Gets cost of ice cream
     * @return ice cream's cost
     */
    public double getCost(){
        return price;
    }

    /** Compares the calories of two ice creams
     * @param o Ice cream to be compared with
     * @return the difference of the two ice creams' calories
     */
    public int compareTo(Object o){

        if (o instanceof IceCream){

            IceCream f = (IceCream) o;

            return this.getCal() - f.getCal();
        }

        return 0;
    }

    /** Returns a string of the ice cream's name and cost
     * @return ice cream's name and cost
     */
    @Override
    public String toString(){
        return  String.format("%-40s%5.2f" , (name), getCost());
    }
}