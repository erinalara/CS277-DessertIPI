import java.text.DecimalFormat;

public class Candy extends DessertItem {

    DecimalFormat df = new DecimalFormat("0.00");

    private double weight;
    private double price;
    private double rate;
    private int cal;

    public Candy(String n) {
        super(n);
        weight = 0.0;
        price = 0.0;
        rate = 0.0;
        cal = 0;
    }

    public Candy(String n, double w, double r, int c){

        super(n);

        weight = w;

        rate = r;

        cal = c;
    }

    public boolean setName (String x){

        if (x != ""){

            name = x;

            return true;
        }

        return false;
    }

    public boolean setWeight (double lbs) {

        if (lbs != 0.0){

            weight = lbs;

            return true;
        }

        return false;
    }

    public boolean setRate (double r){

        if (r != 0.0){

            rate = 0.0;

            return true;
        }

        return false;
    }

    public boolean setCal (int c){

        if (c != 0.0){

            cal = c;

            return true;
        }

        return false;
    }

    public double getWeight () {

        return weight;
    }

    public double getCost () {

        price = ((weight * rate) * 100.0) / 100.0;

        return price;
    }

    public double getRate(){

        return rate;
    }

    public double getCal(){

        return cal;
    }

    @Override
    public String toString(){

        return weight + " @ " + rate + " /lb \n" + name + "(Candy) \t \t \t" + df.format(getCost()) + "\n" + name +
                "(Candy) calories: " + cal;
    }
}
