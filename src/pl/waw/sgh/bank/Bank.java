package pl.waw.sgh.bank;

        import java.math.BigDecimal;
        import java.util.ArrayList;
        import java.util.List;

public class Bank {

    List<Customer> custList = new ArrayList<>();

    List<Account> accList = new ArrayList<>();




    //this is called a sequence in databases
    // -- storing the last ID

    private Integer lastCustID = 0;

    private Integer lastAccID = 0;

    //factory pattern
    //defining, calling a method that ....

    public Customer createCustomer(String firstName,
                                   String lastName,
                                   String email) { //reference to a customer
        Customer customer = new Customer(lastCustID++,firstName, lastName, email);
        custList.add(customer);
        return customer;
    }

    public Account createAccount(Customer customer, boolean isSavings) {
        Account account = (isSavings ?
                new SavingsAccount(lastAccID++, new BigDecimal(0), customer)
                :
                new DebitAccount(lastAccID++, new BigDecimal(0), customer)
        );
        accList.add(account);
        return account;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "custList=" + custList +
                ", accList=" + accList +
                '}';
    }
}

