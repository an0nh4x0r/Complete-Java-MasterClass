package in.swapnilsingh;

public class Bank {

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public Bank() {
        this(12456, 12344.24, "Harsh Bhatia",
                "harshb@gmail.com", "123456789");
        System.out.println("Empty constructor called");
    }

    public Bank(int accountNumber, double balance, String customerName, String email, String phoneNumber) {
        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositBalance(double balance) {
        System.out.println("Depositing balance");
        System.out.println("Previous balance was " + this.balance);
        this.balance += balance;
        System.out.println("New Balance is " + this.balance);
        System.out.println("Exiting balance deposit");
    }

    public void withdrawFunds(double balance) {
        if (this.balance >= balance) {
            System.out.println("Withdrawing Balance");
            System.out.println("Previous balance was " + this.balance);
            this.balance -= balance;
            System.out.println("New balance is " + this.balance);
            System.out.println("Exiting balance withdrawal");
        } else {
            System.out.println("Withdrawal cannot be processed, because the existing balance is: " + this.balance);
        }
    }

}
