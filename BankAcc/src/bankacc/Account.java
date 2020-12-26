package bankacc;

import java.util.Scanner;

public abstract class Account {
    private Person owner;
    private String Password;
    
    static Scanner sc = new Scanner(System.in);
    
    abstract void addAccToOwner(Person owner);
    
    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
}
