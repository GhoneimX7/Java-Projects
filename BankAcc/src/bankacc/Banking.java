
package bankacc;


public interface Banking {
    
    void deposit(double amount);
    void withdraw(double amount);
    void transfer (double amount, BankAcc another);
}
/**
 * Start with an abstract base class called Account that has the following
 * fields   (Object called owner of a class called Person and a String password)
 * methods  (an abstract method called addAccToOwner that takes one parameter
 * of type Person, you also had to set setters and getters)
 * 
 * #####################################################
 * 
 * add a class called Person that has the following
 * 
 * fields   (String name, String ID, a String Email
 * and a List called accounts that holds objects of type Account)
 * 
 * add a constructor that initialize the class fields
 * hint: initialize the list as an ArrayList
 * 
 * methods  (add setters and getters & override the toString method that shows
 * the Object information)
 * 
 * #####################################################
 * 
 * add an interface called Banking that has the following
 * void methods (deposit with one parameter called amount of type double,
 * withdraw with one parameter called amount of type double,
 * transfer with two parameters called amount of type double 
 * and an Object called another of type BankAcc)
 * 
 * #####################################################
 * 
 * add a class called BankAcc the extends the Account class 
 * and implements the Banking interface and has the following
 * 
 * fields (double balance)
 * 
 * add a constructor that initialize the following 
 * parameters (balance, owner, password)
 * 
 * implement the addAccToOwner method which should 
 * add the account to the accounts list of the Person class
 * 
 * hint: the constructor should invoke the addAccToOwner method
 * 
 * implement the Banking interface methods 
 * which should do its functions based on its name.
 * 
 * override the toString method that should show the BankAcc information
 */