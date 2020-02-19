public class IceCream extends DessertItem{

    private double price;
    private int cal;

    public IceCream(String n){
        super(n);
        price = 0.0;
        cal = 0;
    }

    public IceCream(String n, int c){

        super(n);

        cal = c;
    }

    public double getCost(){

        final double choco = 9.99;
        final double van = 7.00;

        if ((name.equals("Chocolate"))) {
            price = choco;
        }

        else if ((name.equals("Vanilla"))){
            price = van;
        }

        return price;
    }

    @Override
    public String toString(){

        return name + "(Ice Cream) \t" + getCost();
    }
}
