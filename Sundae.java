
public class Sundae extends IceCream {

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

        return  String.format("%-40s%5.2f" , (name+" (Sundae)"), getCost());
    }

}
