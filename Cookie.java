public class Cookie extends DessertItem {

    private int amount;
    private double price; // price per dozen
    private int cal;

    public Cookie(String n){
        super(n);
    }

    public Cookie(String n, int a){
        super(n);
        amount = a;
    }

    public void setCal(int c) {
        cal = c;
    }

    public int getCal() {
        return cal;
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


}
