package exercisesession4;

/**
 * @author Your Name 
 * 
 * Learning goal: Understand reference variables and parameter passing.
 * 
 * Exercise 1: In this exercise we will use objects of type Soda and we
 * will apply a special offer to them. Before starting, have a look at 
 * the Soda class and try to understand its functionalities.
 * 
 * Your tasks are:
 * 
 * a) Run the file and describe what happens. Can you justify the outcome?
 * 
 * b) Implement a private static method specialOffer that takes a Soda
 *    object as parameter and increases its discount by 10% only if its current 
 *    price is greater than or equal to 20.0, otherwise it leaves the discount as 
 *    it is. 
 *    For example, if the Soda object has a 50% discount and its price is 40.0, 
 *    then the new discount after the special offer is applied becomes 60%;
 *    if the price is 19.0, the discount remains 50%.
 * 
 * 
 * If the method specialOffer is implemented correctly, the execution 
 * of the main method should look like the following:
 * 
 * Cost before offer:
 * Coca-cola costs: 20.0
 * Pepsi-cola costs: 16.0
 * Apply the offer to Pepsi-cola
 * Coca-cola costs: 20.0
 * Pepsi-cola costs: 16.0
 * Apply the offer to Coca-cola
 * Coca-cola costs: 18.0
 * Pepsi-cola costs: 16.0
 * 
 */
public class Supermarket {
    
    public static void main(String[] args) {
        
        // DO NOT MODIFY THIS TEST METHOD!      
        Soda coke = new Soda("Coca-cola",20);
        Soda pepsi = new Soda("Pepsi-cola",16);
        
        System.out.println("Cost before offer:");
        System.out.println(coke.name + " costs: " + coke.getPrice());
        System.out.println(pepsi.name + " costs: " + pepsi.getPrice());
        
        System.out.println("Apply the offer to Pepsi-cola");
        specialOffer(pepsi);
        
        System.out.println(coke.name + " costs: " + coke.getPrice());
        System.out.println(pepsi.name + " costs: " + pepsi.getPrice());
        
        System.out.println("Apply the offer to Coca-cola");
        specialOffer(coke);
        
        System.out.println(coke.name + " costs: " + coke.getPrice());
        System.out.println(pepsi.name + " costs: " + pepsi.getPrice());
    }
    
    private static void specialOffer(Soda soda){
        // Your solution should go here
        double price = soda.getPrice();
        if (price >= 20.0 ){
            soda.setDiscount(10);
        }
    }
    
}
