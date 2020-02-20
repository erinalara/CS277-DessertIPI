/** @authors Eric Truong, Erina Lara
 * Date: February 18, 2020
 * Description: Subclass creates a Candy child Object that extends the DessertItem super class.
 * The Candy child has a weight, price, rate, and number of calories.
 *
 */
public class Candy extends DessertItem{

    /** how much the candy weighs */
    private double weight;
    /** the total price for the specific candy */
    private double price;
    /** the rate of how much the candy costs per pound */
    private double rate;
    /** the number of calories in the candy */
    private int cal;

    /** Constructs a candy with the given name
     */
    public Candy() {
        super();
        weight = 0;
        price = 0.0;
        rate = 0.0;
        cal = 0;
    }

    /** Constructs a candy with given name, weight, rate, and calories
     * @param n name of candy
     * @param w weight of the candy
     * @param r candy's rate of cost per pound
     * @param c the number of calories in the candy
     */
    public Candy(String n, double w, double r, int c){
        super(n + " (Candy)");
        weight = w;
        rate = r;
        cal = c;
    }

    /** Sets name to the a candy
     * @param x name to be set for the candy
     * @return true if name was successfully set, false if not
     */
    public boolean setName (String x){
        if (x != ""){
            name = x;
            return true;
        }
        return false;
    }

    /** Sets weight for candy
     * @param lbs the candy's weight
     * @return true if the candy's weight was successfully set, false if not
     */
    public boolean setWeight (double lbs) {
        if (lbs != 0.0){
            weight = lbs;
            return true;
        }
        return false;
    }

    /** Sets cost rate per pound for the candy
     * @param r given cost rate per pound for candy
     * @return true if cost rate for candy was successfully set, false if not
     */
    public boolean setRate (double r){
        if (r != 0.0){
            rate = 0.0;
            return true;
        }

        return false;
    }

    /** Sets number of calories for the candy
     * @param c number of calories to be set
     * @return true if calories for candy was successfully set, false if not
     */
    public boolean setCal (int c){
        if (c != 0){
            cal = c;
            return true;
        }

        return false;
    }

    /** Gets candy's weight
     * @return weight of candy
     */
    public double getWeight () {

        return weight;
    }

    /** Gets total cost of candy, based off weight and rate per pound
     * @return total cost of candy
     */
    public double getCost () {

        price = (weight * rate);
        return price;
    }

    /** Gets rate of cost per pound for a candy
     * @return candy's cost rate per pound
     */
    public double getRate(){
        return rate;
    }

    /** Gets number of calories from candy
     * @return number in calories in the candy
     */
    public int getCal(){
        return cal;
    }

    /** Compares the calories of two candies
     * @param o Candy to be compared with
     * @return the difference of the two candies' calories
     */
    public int compareTo(Object o){

        if (o instanceof Candy){
            Candy f = (Candy) o;
            return this.getCal() - f.getCal();
        }
        return 0;
    }


    /** Returns a string of the candy's weight, rate, name, and cost
     * @return string of candy's weight, rate, name, and cost
     */
    @Override
    public String toString(){
        return weight + " @ " + rate + " /lb. \n" + String.format("%-40s%5.2f" , (name), getCost());
    }

}