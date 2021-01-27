package banckaccount;

public class BankAcc extends Account implements Banking {
    private double balance;

    public BankAcc(double balance, Person owner, String password) {
        super(owner, password);
        this.balance = balance;
    }


    @Override
    public String toString(){
        return "Person: " + super.getOwner().getName() +
                " Password: " + super.getPassword()
                +" Balance: " + this.balance;
    }

    @Override
    public void addAccToOwner(Person owner) {
        owner.getAccounts().add(this);
    }

    @Override
    public void deposit(double amount) {
        if(amount > 0)
            balance += amount;
        else
            System.out.println("Invalid process!");
    }

    @Override
    public void withdraw(double amount) {
        if(amount > 0 && balance >= amount)
            this.balance -= amount;
        else
            System.out.println("Invalid process!");
    }

    @Override
    public void transfer(double amount, BankAcc another) {
        if(amount > 0 && amount >= balance){
            another.balance += amount;
            this.balance -= amount;
        }
        else
            System.out.println("Invalid process!");
            
    }
    
    
    
    
    
}
