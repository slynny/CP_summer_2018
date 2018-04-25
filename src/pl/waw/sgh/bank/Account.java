package pl.waw.sgh.bank;

import java.math.BigDecimal;

    public abstract class Account {

        private Integer accountID;

        private BigDecimal balance; //BigDecimal - no loss in precision, used for currencies
        //methods for adding, subtracting etc for BigDecimals

        private Customer customer;

        private String currency = "USD";


        //skipping currency in constructors - for simplicity here


        public Account(Integer accountID, BigDecimal balance, Customer customer) {
            this.accountID = accountID;
            this.balance = balance;
            this.customer = customer;
        }

        public Integer getAccountID() {
            return accountID;
        }

        public void setAccountID(Integer accountID) {
            this.accountID = accountID;
        }

        public BigDecimal getBalance() {
            return balance;
        }

        public void setBalance(BigDecimal balance) {
            this.balance = balance;
        }

        public Customer getCustomer() {
            return customer;
        }

        public void setCustomer(Customer customer) {
            this.customer = customer;
        }

        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }

        @Override
        public String toString() {
            return "Account{" +
                    "accountID=" + accountID +
                    ", balance=" + balance +
                    ", customer=" + customer +
                    ", currency='" + currency + '\'' +
                    '}';
        }
    }


    //HOMEWORK
//