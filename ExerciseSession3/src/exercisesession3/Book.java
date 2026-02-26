
package exercisesession3;

/**
 * @author Your Name 
 * 
 * Learning goal: Declaring a class from a UML class diagram.
 * 
 * Exercise 3: Mark needs your help. He has been asked to declare a class 
 * according to the following UML class diagram:
 *
 *      ---------------------------------
 *      |           Book                |
 *      ---------------------------------
 *      | + title : String              |
 *      | + author: String              |
 *      | - pageNumber: int             |
 *      ---------------------------------
 *      | + setPageNumber(int):void
 *      | + getPageNumber():int
 *      | + getPrice():double           |
 *      ---------------------------------
 *
 * The methods shall work as follows:
 * - setPageNumber() sets the value of the attribute 'pageNumber' equals
 * to the one passed as a parameter;
 * - getPageNumber() returns the value of the attribute 'pageNumber'
 * - knowing that the cost for printing a single page is 0.3kr the
 * method getPrice() returns the price of the book.
 *
 */
public class Book {
    
    // Your solution goes here
    public String title;
    public String author;
    private int pageNumber;

    public Book(){
        title = "book of books";
        author = "Author of books";
        pageNumber = 14902;
    }

    public void setPageNumber(int page){
        pageNumber = page;
    }

    public int getPageNumber(){
        return pageNumber;
    }

    public double getPrice(){
        double price = 0.3;
        return pageNumber * price;
    }
}
