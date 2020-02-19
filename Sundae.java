public class Sundae extends IceCream {

    private double price; // cost of ice cream + topping
    private int cal;

    public Sundae(String n) {
        super(n);
    }

    public double getCost(){

        price = super.getCost();

        final double carm = 11.99;
        final double straw = 9.00;

        if ((name.equals("Caramel"))) {
            price += carm;
        }

        else if ((name.equals("Strawberry"))){
            price += straw;
        }

        return price;
    }

    @Override
    public String toString(){

        return price + "\n" + name + "(Sundae) \t" + getCost();
    }

}
