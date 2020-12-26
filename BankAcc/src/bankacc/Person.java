package bankacc;

import java.util.ArrayList;
import java.util.List;

public class Person {
    
    private String name;
    private String ID;
    private String Email;
    
    private List<Account> accounts;
    
    public Person(String name, String ID, String Email){
        
        this.name = name;
        this.ID = ID;
        this.Email = Email;
        accounts = new ArrayList<Account>();
    
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    @Override
    public String toString() {
        return "name = " + name + "\nID = " + ID + "\nEmail = " + Email;
    }
    
}