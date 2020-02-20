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

        price = (amount * rate / 12.0);

        return price;
    }

    @Override
    public String toString(){

        return amount + " @ " + rate + " / lb \n" + String.format("%-40s%5.2f" , (name+" (Cookie)"), getCost());
    }


}
