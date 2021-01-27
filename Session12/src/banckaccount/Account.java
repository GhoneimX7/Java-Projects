package banckaccount;

public abstract class Account {

    private Person owner;
    private String password;

    public Account(Person owner, String password) {
        this.owner = owner;
        this.password = password;
    }
    
    public abstract void addAccToOwner(Person owner);

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public Person getOwner() {
        return this.owner;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
