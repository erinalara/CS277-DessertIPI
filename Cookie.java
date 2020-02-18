public class Cookie extends DessertItem {

    private int amount;
    private double per; // price per dozen
    private int cal;

    public Cookie(String n){

        super(n);
    }

    public double getCost(){

        //per = Math.round(amount(399/12));

        return 0.0;
    }


}
