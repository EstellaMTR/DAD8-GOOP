package exercisesession4;


import java.util.ArrayList;

/**
 * @author Your Name 
 * 
 * Learning goal: Use of ArrayList objects.
 * 
 * Exercise 2: In this exercise we will collect objects of type Soda using
 * ArrayLists. 
 * 
 * Your tasks are:
 * 
 * a) Implement a static private method showSoda that given a Soda object
 *    as parameter prints its name and price. 
 * 
 * b) Implement a static private method showAllSodas that, given as a parameter 
 *    an ArrayList of Soda objects, prints its content. 
 *    Hint: You can use the method showSoda implemented before.
 * 
 * c) Create an ArrayList containing objects of type Soda and
 *    add the following Sodas to it. To see the result, show its content
 *    using the method showAllSodas implemented before.
 *      
 *      name & baseprice
 *      ----------------
 *      Coca-cola: 20
 *      Pepsi-cola: 15
 *      Fanta: 13
 *      Faxe Kondi: 12
 *      Red Bull: 50
 * 
 * An example of execution should look like this:
 * 
 * Coca-cola costs: 20.0
 * Pepsi-cola costs: 15.0
 * Fanta costs: 13.0
 * Faxe Kondi costs: 12.0
 * Red Bull costs: 50.0
 * 
 * Exercise 3: In this exercise we will manipulate ArrayLists of different type.
 * 
 * Your tasks are:
 * 
 * d) Implement a private static method called getPriceList that, given an 
 *    ArrayList of Soda objects as parameter, returns an ArrayList of 
 *    doubles containing the price of each Soda object.
 * 
 * e) Test the getPriceList method on the ArrayList of sodas created in 
 *    Exercise 2.c.
 */

public class OpenBar {
    
    public static void main(String[] args) {
        // The solution of (c) goes here
        ArrayList<Soda> sodas = new ArrayList<Soda>();

        sodas.add(new Soda("Coca-cola", 20));
        sodas.add(new Soda("Pepsi-cola", 13));
        sodas.add(new Soda("Fanta", 15));
        sodas.add(new Soda("Faxe Kondi", 12));
        sodas.add(new Soda("Red Bull", 50));
        showAllSodas(sodas);
        // The solution of (e) goes here
        System.out.println("Price List: " + getPriceList(sodas));
    }
    
    // The solution of (a) goes here
    private static void showSoda(Soda soda){
        System.out.println("Soda name: " + soda.name);
        System.out.println("Soda price: " + soda.getPrice());
    }
    
    // The solution of (b) goes here
    private static void showAllSodas(ArrayList<Soda> sodas){
        for (Soda soda : sodas){
            showSoda(soda);
        }
    }
    
    // The solution of (d) goes here
    private static ArrayList<Double> getPriceList(ArrayList<Soda> sodas){
        ArrayList<Double> priceList = new ArrayList<Double>();
        for (Soda soda : sodas){
            priceList.add(soda.getPrice());
        }
        return priceList;
    }
}
