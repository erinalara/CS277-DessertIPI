import java.lang.Math;

public class Candy extends DessertItem {

    private double weight;
    private double price;
    private double rate;
    private int cal;

    public Candy(String n) {
        super(n);
    }

    public Candy(String n, double w, double r, int c){

        super(n);

        weight = w;

        rate = r;

        cal = c;
    }

    public boolean setWeight (double lbs) {

        if (lbs != 0.0){

            weight = lbs;

            return true;
        }

        return false;
    }

    public double getWeight () {

        return weight;
    }

    public double getCost () {

        price = Math.round((weight * rate) * 100.0) / 100.0;

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

        return weight + " @ " + rate + " lb \n" + name + "(Candy) \t" + getCost();
    }
}
