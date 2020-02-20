public class IceCream extends DessertItem{

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

        return  String.format("%-40s%5.2f" , (name+" (Ice Cream)"), getCost());
    }
}
