public class Cookie extends DessertItem {

    private int amount;
    private double per; // price per dozen
    private int cal;

    public Cookie(){

        super();
    }

    public double getCost(){

        per = Math.round(amount(399/12));
    }
}
