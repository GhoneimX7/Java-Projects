package banckaccount;

public interface Banking {
    void deposit(double amount);
    void withdraw(double amount);
    void transfer(double amount, BankAcc another);
}
