public class IceCream extends DessertItem {

    private double price;
    private double tax;
    private int cal;

    public IceCream(String n){

        super(n);
        price = 0.0;
        tax = 0.0;
        cal = 0;
    }

    public IceCream(String n, double p, double t, int c){

        super(n);
        price = p;
        tax = t;
        cal = c;
    }

    public boolean setName(String x){

        if (x != ""){

            this.name = x;

            return true;
        }

        return false;
    }

    public boolean setPrice(double x){

        if (x != 0.0){

            price = x;

            return true;
        }

        return false;
    }

    public boolean setTax(double x){

        if (x != 0.0){

            tax = x;

            return true;
        }

        return false;
    }

    public boolean setCal(int x){

        if (x != 0){

            cal = x;

            return true;
        }

        return false;
    }

    public double getTax(){

        return tax;
    }

    public double getCost(){

        return price;
    }

    public int getCal(){

        return cal;
    }

    @Override
    public String toString(){

        return name + "(IceCream) \t \t \t" + price + "\n" + name + "(IceCream) calories: " + cal;
    }
}
