
package exercisesession3;

/**
 * @author Your Name 
 * 
 * Learning goal: Using a class, creating objects, and using them.
 * 
 * Exercise 2: Now that we have understood the class Soda, let's make some.
 * Your tasks consists in:
 * 
 * 1. Instantiate two Soda objects having the following characteristics:
 * 
 * Object 1:            |   Object 2:
 *  name: "Coca-Cola"   |    name: "Pepsi-Cola"
 *  baseprice: 20       |    baseprice: 16
 *  discount: 25        |    discount: 0
 * 
 * 2. Print their respective prices
 * 
 * An example of execution should look like this:
 * 
 * Coca-Cola costs: 15.0
 * Pepsi-Cola costs: 16.0
 * 
 * Hint: The class Soda is already defined. Use it!
 */
public class Supermarket {
    
    public static void main(String[] args) {
        // Your solution should go here

        Soda coke = new Soda();
        Soda pepsi = new Soda();

        coke.name = "Coca-Cola";
        coke.setBasePrice(20);
        coke.setDiscount(25);

        pepsi.name = "Pepsi-Cola";
        pepsi.setBasePrice(16);
        pepsi.setDiscount(0);

        System.out.println("Coca-Cola: " + coke.getPrice());
        System.out.println("Pepsi-Cola: " + pepsi.getPrice());

    }
    
    
    
}
