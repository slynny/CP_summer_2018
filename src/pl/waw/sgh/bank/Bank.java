package pl.waw.sgh.bank;


import pl.waw.sgh.bank.exceptions.InvalidAmountException;
import pl.waw.sgh.bank.exceptions.NegativeAmountException;
import pl.waw.sgh.bank.exceptions.NonExistantAccountException;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Bank {

    List<Customer> custList = new ArrayList<>();

    List<Account> accList = new ArrayList<>();

    private Integer lastCustID = 0;

    private Integer lastAccID = 0;

    public Customer createCustomer(String firstName,
                                   String lastName,
                                   String email) {
        Customer customer = new Customer(lastCustID++,firstName, lastName, email);
        custList.add(customer);
        return customer;
    }

    public void deleteCustomer(Integer custId) {
        Customer custToDel = findCustomerById(custId);
        for (Account acc : accList) {
            if (custToDel == acc.getCustomer()) {
                accList.remove(acc);
            }
        }
        //TODO First find all accounts that belong to that customer and delete them
        custList.remove(custToDel);
    }

    public void updateCustomer(Integer custId,
                               String firstName,
                               String lastName,
                               String email) {
        Customer custToSave = findCustomerById(custId);
        for (Account acc : accList) {
            if (custToSave == acc.getCustomer()) {
                acc.setCustomer(custToSave);
            }
        }
        custToSave.setCustomerID(custId);
        custToSave.setFirstName(firstName);
        custToSave.setLastName(lastName);
        custToSave.setEmail(email);
    }

    public Customer moveToPrevCust(Integer custId) {
        custId = custId - 1;
        return findCustomerById(custId);
    }

    public Customer moveToNextCust(Integer custId) {
        custId = custId + 1;
        return findCustomerById(custId);
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

    public void transfer(Integer fromAccId, Integer toAccId, double amount)
            throws InvalidAmountException, NonExistantAccountException, NegativeAmountException {
        Account fromAcc = findAccountById(fromAccId);
        Account toAcc = findAccountById(toAccId);
        fromAcc.charge(amount);
        toAcc.deposit(amount);
    }
/*
    public void transfer(Integer fromAccId, Integer toAccId, double amount) {
        Account fromAcc = findAccountById(fromAccId);
        Account toAcc = findAccountById(toAccId);
        int res = fromAcc.charge(amount);
        if (res<0) {
            System.out.println("Not enough money");
            System.exit(res);
        }
        toAcc.deposit(amount);
    }
*/

    public Account findAccountById(int id) throws NonExistantAccountException {
        // iterate through the account list and return the account with a given id
        for (Account acc : accList) {
            //if (id.equals(acc.getAccountID()))
            if (id==acc.getAccountID())
                return acc;
        }
        throw new NonExistantAccountException("Account id: " + id + " does not exist!");
        //return null;
    }

    public Customer findCustomerById(int id) {
        for (Customer cust : custList) {
            if (id==cust.getCustomerID())
                return cust;
        }
        return null;
    }

 /*   public Account findAccountsOFCustomer(Customer customer) {
    for (Account acc : accList) {
        if (customer==acc.getCustomer())
            return acc;
    }
    return null;
} */

    //public Customer getCustomer() { return customer; }


    @Override
    public String toString() {
        return "Bank{" +
                "cust=" + custList +
                "\nacc=" + accList +
                '}';
    }
}