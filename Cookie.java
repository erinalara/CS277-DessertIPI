import java.text.DecimalFormat;

public class Cookie extends DessertItem {

    DecimalFormat df = new DecimalFormat("0.00");

    private int amount;
    private double price; // price per dozen
    private double rate;
    private int cal;

    public Cookie(String n){

        super(n);
        amount = 0;
        price = 0.0;
        rate = 0.0;
        cal = 0;
    }

    public Cookie(String n, int a, double r, int c){

        super(n);
        amount = a;
        rate = r;
        cal = c;
    }

    public boolean setName(String x){

        if (x != ""){

            name = x;

            return true;
        }

        return false;
    }

    public boolean setAmount(int x){

        if (x != 0){

            amount = x;

            return true;
        }

        return false;
    }

    public boolean setPrice(double x){

        if (x != 0.0){

            price = x;

            return true;
        }

        return false;
    }

    public boolean setRate(double x){

        if (x != 0.0){

            rate = x;

            return true;
        }

        return false;
    }

    public boolean setCal(int c) {

        if ( c != 0){

            cal = c;

            return true;
        }

        return false;
    }

    public double getRate(){

        return rate;
    }

    public int getCal() {
        return cal;
    }

    public double getCost(){

        price = (amount / 12.0) * rate;

        return price;
    }

    public String toString(){

        return amount + " @ " + rate + " /dz. \n" + name + "(Cookie) \t \t \t" + df.format(getCost()) + "\n" +
                name + "(Cookie) calories: " + cal;
    }
}
