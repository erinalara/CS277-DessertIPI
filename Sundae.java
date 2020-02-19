import java.text.DecimalFormat;

public class Sundae extends IceCream {
    DecimalFormat df = new DecimalFormat("0.00");

    private double price; // cost of ice cream + topping
    private double top;
    private int cal;

    public Sundae(String n) {
        super(n);
    }

    public Sundae(String n, double t, int c) {
        super(n);
        top = t;
        cal = c;
    }

    public double getCost(){

        price = super.getCost() + top;

        return price;
    }

    @Override
    public String toString(){

        return name + "(Sundae) \t" + df.format(getCost());
    }

}
