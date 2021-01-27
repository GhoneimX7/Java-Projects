package banckaccount;

import java.util.ArrayList;
import java.util.List;


public class Person {
    private String name;
    private String id;
    private String email;
    private List<Account> accounts;

    public Person(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.accounts = new ArrayList<Account>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", id=" + id + ", email=" + email + ", accounts=" + accounts + '}';
    }
    
    
    
    
    
    
}
