package bankacc;

public class BankAcc extends Account implements Banking{
    
    private double balance;
    
    public BankAcc(Person owner, String Password, double balance){
        
        super();
        this.balance = balance;
        this.setOwner(owner);
        this.setPassword(Password);
        this.addAccToOwner(owner);
        
    }

    
    @Override
    void addAccToOwner(Person person) {
        person.getAccounts().add(this);
    }

    @Override
    public void deposit(double amount) {
        this.balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if(amount <= balance)
            balance -= amount;
        else
            System.out.println("no enough balance!");
    }

    @Override
    public void transfer(double amount, BankAcc another) {
        if(this.balance <= amount){
            another.balance += amount;
            this.balance -= amount;
        }
        else
            System.out.println("no enough balance!");
    }

    @Override
    public String toString() {
        System.out.print("Enter your password: ");
        if(sc.next().equals(this.getPassword())){
        String ownerInfo = this.getOwner().toString();
        return ownerInfo +  "\nbalance = " + balance;
        }
        else
            return "invalid password!";
    }
    
    
}