public class IceCream extends DessertItem{

    private double price;
    private int cal;

    public IceCream(String n){
        super(n);
        price = 0.0;
        cal = 0;
    }

    public IceCream(String n, double p, int c){
        super(n);
        price = p;
        cal = c;
    }

    public int getCal(){

        return cal;
    }

    public double getCost(){
        return price;
    }

    public int compareTo(Object o){

        if (o instanceof IceCream){

            IceCream f = (IceCream) o;

            return this.getCal() - f.getCal();
        }

        return 0;
    }

    public IceCream getMax(Object o){

        if (o instanceof IceCream){

            IceCream f = (IceCream) o;

            if (this.compareTo(f) > 0){

                return this;
            }
            else{
                return f;
            }
        }

        return this;
    }
    @Override
    public String toString(){

        return  String.format("%-40s%5.2f" , (name+" (Ice Cream)"), getCost());
    }
}
