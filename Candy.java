import java.lang.Math;

public class Candy extends DessertItem {

    private double weight;
    private double price;
    private int cal;

    public Candy(String n) {
        super(n);
    }

    public Candy(String n, double w){

        super(n);

        weight = w;
    }

    public void setWeight (double lbs) {
        weight = lbs;
    }

    public double getWeight () {
        return weight;
    }

    public double getCost () {

        final double cornRate = 7.25;

        final double lolipopRate = 8.25;

        if ((name.equals("Corn"))) {

            price = Math.round((weight * cornRate) * 100.0) / 100.0;
        }

        else if ((name.equals("Lolipop"))){

            price = Math.round((weight * lolipopRate) * 100.0) / 100.0;
        }

        return price;
    }

    @Override
    public String toString(){

        return weight + " @ something lb \n" + name + "(Candy) \t" + getCost();
    }
}
