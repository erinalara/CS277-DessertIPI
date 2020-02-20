/** @authors Eric Truong, Erina Lara
 * Date: February 17, 2020
 * Description: Subclass creates a Cookie child Object that extends the DessertItem superclass.
 * The Cookie child object has an amount (number of cookies), total price, rate of cost per dozen,
 * and a number of calories.
 *
 */

public class Cookie extends DessertItem {

    /** number of cookies */
    private int amount;
    /** total price for specified amount of cookies */
    private double price;
    /** cost of cookies per dozen */
    private double rate;
    /** number of calories in cookie */
    private int cal;

    /** Constructs a cookie with given name
     * @param n name of cookie
     */
    public Cookie(String n){
        super(n);
        amount = 0;
        price = 0.0;
        rate = 0.0;
        cal = 0;
    }

    /** Constructs a cookie with given name, amount, rate, and calories
     * @param n name of cookie
     * @param w number of specified cookie
     * @param r cost per dozen for the cookie
     * @param c number of calories
     */
    public Cookie(String n, int w, double r, int c){

        super(n);

        amount = w;

        rate = r;

        cal = c;
    }

    /** Sets number of cookies
     * @param a specified amount of cookies
     * @return true if amount of cookies was successfully set, false if not
     */
    public boolean setAmount (int a) {
        if (a != 0){
            amount = a;
            return true;
        }
        return false;
    }

    /** Gets amount of cookies
     * @return number of specified cookies
     */
    public double getAmount () {
        return amount;
    }

    /** Sets number of calories for cookie
     * @param c number of calories for cookie
     * @return true if number of calories was successfully set, false if not
     */
    public boolean setCal(int c) {
        if (c != 0){
            cal = c;
            return true;
        }
        return false;
    }

    /** Gets number of calories of cookie
     * @return cookie's number of calories
     */
    public int getCal() {
        return cal;
    }

    /** Gets cost per dozen for cookie
     * @return cost per dozen for cookie
     */
    public double getRate(){
        return rate;
    }

    /** Gets total cost of cookies based of amount and rate
     * @return total cost of cookies
     */
    public double getCost(){

        price = (amount * rate / 12.0);

        return price;
    }

    /** Compares the calories of two cookies
     * @param o Cookie to be compared with
     * @return the difference of the two cookies' calories
     */
    public int compareTo(Object o){

        if (o instanceof Cookie){

            Cookie f = (Cookie) o;

            return this.getCal() - f.getCal();
        }

        return 0;
    }


    /** Returns a string of the cookie's amount, cost per dozen rate, name, and total cost
     * @return cookie amount, cost rate per dozen, name, and total cost
     */
    @Override
    public String toString(){
        return amount + " @ " + rate + " / lb \n" + String.format("%-40s%5.2f" , (name+" (Cookie)"), getCost());
    }

}
