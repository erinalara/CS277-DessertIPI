/** @authors Eric Truong, Erina Lara
 * Date: February 18, 2020
 * Description: Subclass creates an IceCream child Object that extends the DessertItem superclass.
 * An IceCream child object has a price and number of calories.
 *
 */

public class IceCream extends DessertItem{

    /** price for ice cream*/
    private double price;
    /** number of calories of the ice cream*/
    private int cal;

    /** Constructs an IceCream object with the given name
     * @param n name of Ice cream
     */
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
        super(n);
        price = p;
        cal = c;
    }

<<<<<<< HEAD
    public int getCal(){

        return cal;
    }

=======
    /** Gets cost of ice cream
     * @return ice cream's cost
     */
>>>>>>> da44f10d2c1947ba7f42508b9745fcd2b97f46c5
    public double getCost(){
        return price;
    }

<<<<<<< HEAD
    public int compareTo(Object o){

        if (o instanceof IceCream){

            IceCream f = (IceCream) o;

            return this.getCal() - f.getCal();
        }

        return 0;
    }

    public IceCream getMax(Object o){

        if (o instanceof IceCream){

            IceCream f = (IceCream) o;

            if (this.compareTo(f) > 0){

                return this;
            }
            else{
                return f;
            }
        }

        return this;
    }
=======
    /** Returns a string of the ice cream's name and cost
     * @return ice cream's name and cost
     */
>>>>>>> da44f10d2c1947ba7f42508b9745fcd2b97f46c5
    @Override
    public String toString(){
        return  String.format("%-40s%5.2f" , (name+" (Ice Cream)"), getCost());
    }
}
