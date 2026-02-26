
package exercisesession3;

/**
 * @author Your Name 
 * 
 * Learning goal: Understanding the declaration of a class
 * 
 * Exercise 1: Mark has been lazy again. This time he "forgot" to 
 * give his colleagues the UML class diagram for the class Soda.
 * 
 * Your task is to identify the different components of the
 * class, classify them, and draw the corresponding UML class diagram
 * (in a piece of paper or on a computer).
 * 
 * Add as comments the explanations of what do you think the attribute 
 * variables of the Soda class are used for and what the methods are doing. 
 */

public class Soda {

    // The attributes of the class Soda - a name, a base price and a discount
    public String name;
    private double baseprice;
    private int percentdiscount;

    // constructor - constructing an instance of Soda, with "noname" as name, baseprice as 0 and percentdiscount as 100
    public Soda() {
        name = "noname";
        baseprice = 0;
        percentdiscount = 100;
    }

    // The methods of the Soda class

    // Setting the baseprice to equal the price, which is passed in as an input parameter when the function is called
    // The price is set to equal whatever double is passed in when the function is called
    public void setBasePrice(double price) {
        baseprice = price;
    }

    // Setting the percent discount to equal whatever int is passed in as an input parameter when the function is called
    public void setDiscount(int discount) {
        percentdiscount = discount;
    }

    // Calculating the price
    // Returning the price
    public double getPrice() {
        return baseprice * (100 - percentdiscount)/100;
    }

}
