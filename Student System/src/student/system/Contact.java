package student.system;

public class Contact {
    private String city;
    private String mobileNumber;
    private String email;

    public Contact(String city, String mobileNumber, String email) {
        this.city = city;
        this.mobileNumber = mobileNumber;
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return " city = " + city + ", mobileNumber = " + mobileNumber + ", email = " + email ;
    }
    
    
    
}
