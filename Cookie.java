import java.text.DecimalFormat;

public class Cookie extends DessertItem {

    private int amount;
    private double price; // price per dozen
    private double rate;
    private int cal;

    public Cookie(String n){
        super(n);
        amount = 0;
        price = 0.0;
        rate = 0.0;
        cal = 0;
    }

    public Cookie(String n, int w, double r, int c){

        super(n);

        amount = w;

        rate = r;

        cal = c;
    }

    public boolean setAmount (int a) {
        if (a != 0){
            amount = a;
            return true;
        }
        return false;
    }

    public double getAmount () {
        return amount;
    }

    public void setCal(int c) {
        cal = c;
    }

    public int getCal() {
        return cal;
    }

    public double getRate(){
        return rate;
    }

    public double getCost(){

        final double chocoRate = 499 / 12;
        final double oatRate = 399 / 12;

        if ((name.equals("Chocolate Chip"))) {
            price = Math.round(amount*(chocoRate));
        }

        else if ((name.equals("Oatmeal"))){
            price = Math.round(amount*(oatRate));
        }
        return price;
    }

    @Override
    public String toString(){

        return amount + " @ something lb \n" + name + "(Cookie) \t" + getCost();
    }


}
