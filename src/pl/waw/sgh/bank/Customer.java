package pl.waw.sgh.bank;
// bins
//POJO - plain old java object - structures that are basic, mostly to store data


public class Customer {

    private Integer customerID;

    private String firstName;

    private String lastName;

    private String email;

    //gettter and setter methods
    //taking from PRIVATE
    // Generate --> getter, setter

    // Generate --> constructor
    public Customer(Integer customerID, String firstName, String lastName, String email) {
        this.customerID = customerID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }


    // Generate --> getter, setter


    public Integer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Generate --> toString
    @Override
    public String toString() {
        return "\nCustomer{" +
                "customerID=" + customerID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
