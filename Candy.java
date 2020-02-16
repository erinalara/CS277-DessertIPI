import java.lang.Math;

public class Candy extends DessertItem {

    private double weight;
    private double price;
    private int cal;

    public Candy() {
        super();
    }

    public void setWeight (double lbs) {
        weight = lbs;
    }

    public double getWeight () {
        return weight;
    }

    public double getCost () {

        price = Math.round(weight * 0.89);

        return price;
    }
}
