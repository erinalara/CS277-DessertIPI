import java.text.DecimalFormat;

public class IceCream extends DessertItem{
    DecimalFormat df = new DecimalFormat("0.00");

    private double price;
    private int cal;

    public IceCream(String n){
        super(n);
        price = 0.0;
        cal = 0;
    }

    public IceCream(String n, double p, int c){
        super(n);
        price = p;
        cal = c;
    }

    public double getCost(){
        return price;
    }

    @Override
    public String toString(){

        return name + "(Ice Cream) \t" + df.format(getCost());
    }
}
