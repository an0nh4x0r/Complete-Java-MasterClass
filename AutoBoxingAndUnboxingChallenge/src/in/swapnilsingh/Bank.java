package in.swapnilsingh;

import javax.sql.rowset.spi.TransactionalWriter;
import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.newCustomer(customerName, initialAmount);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double initialAmount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addCustomerTransaction(customerName, initialAmount);
        }
        return false;
    }

    private Branch findBranch(String branchName) {
        for (Branch branch : this.branches) {
            if (branch.getName().equals(branchName)) {
                return branch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean showTransactions) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("Customer details for the branch " + branch.getName());

            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for (Customer customer : branchCustomers) {
                System.out.println("Customer: " + customer.getName());
                if (showTransactions) {
                    ArrayList<Double> transactions = customer.getTransactions();
                    for (double transaction : transactions) {
                        System.out.println(transaction);
                    }
                }
            }
            return true;
        }
        return false;
    }
}
