
package part1;

/**
 * @author Giovanni Bacci
 */
public class BankAccountExample {

    public static void main(String[] args) {
        
        BankAccount giorgios = new BankAccount();
        BankAccount silvios = new BankAccount();

        System.out.println("before deposit");
        System.out.println("Giorgio's balance: " + giorgios.getBalance());
        System.out.println("Silvio's balance: " + silvios.getBalance());

        giorgios.deposit(100);
        silvios.deposit(100000);

        System.out.println("after deposit");
        System.out.println("Giorgio's balance: " + giorgios.getBalance());
        System.out.println("Silvio's balance: " + silvios.getBalance());

        giorgios.withdraw(50);

        System.out.println("after withdraw");
        System.out.println("Giorgio's balance: " + giorgios.getBalance());
        System.out.println("Silvio's balance: " + silvios.getBalance());


        
    }
    
}
