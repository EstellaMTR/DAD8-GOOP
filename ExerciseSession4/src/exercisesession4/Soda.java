package exercisesession4;

/**
 * This class is here only to be used to solve the exercises
 *  ------------------------------------------------
 *  ----------- DO NOT CHAGE THIS CLASS! -----------
 *  ------------------------------------------------
 */

public class Soda {

    public String name;
    private double baseprice;
    private int percentdiscount;

    public Soda(String n, int price) {
        name = n;
        setBasePrice(price);
        setDiscount(0);
    }
    
    public void setBasePrice(double price) {
        baseprice = price;
    }
    
    public int getDiscount(){
        return percentdiscount;
    }
    
    public void setDiscount(int discount) {
        percentdiscount = discount;
    }
    
    public double getPrice() {
        return baseprice * (100 - getDiscount())/100;
    }

}
