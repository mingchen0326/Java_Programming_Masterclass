package bankApplication;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String nameOfBank) {
        this.name = nameOfBank;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String nameOfBranch) {
        if (findBranch(nameOfBranch) == null) {
            Branch branch = new Branch(nameOfBranch);
            this.branches.add(branch);
            return true;
        } else {
            return false;
        }
    }

    public boolean addCustomer(String nameOfBranch, String nameOfCustomer, double transaction) {
        if (findBranch(nameOfBranch) != null) {
            Branch branch = this.findBranch(nameOfBranch);
            return branch.newCustomer(nameOfCustomer, transaction);
        } else {
            return false;
        }
    }

    public boolean addCustomerTransaction(String nameOfBranch, String nameOfCustomer, double transaction) {
        if (findBranch(nameOfBranch) != null && findBranch(nameOfBranch).findCustomer(nameOfCustomer) != null) {
            findBranch(nameOfBranch).findCustomer(nameOfCustomer).addTransaction(transaction);
            return true;
        } else {
            return false;
        }
    }

    private Branch findBranch(String nameOfBranch) {
        for (int i=0; i<this.branches.size(); i++) {
            if (this.branches.get(i).getName().equals(nameOfBranch)) {
                return this.branches.get(i);
            }
        }
        return null;
    }

    public boolean listCustomers(String nameOfBranch, boolean printTransaction) {
        if (this.findBranch(nameOfBranch) == null) {
            return false;
        } else {
            Branch branch = this.findBranch(nameOfBranch);
            for (int i=0; i<branch.getCustomers().size(); i++) {
                Customer customer = branch.getCustomers().get(i);
                System.out.println("Customer details for branch " + nameOfBranch);
                System.out.println("Cusotmer: " + customer.getName() +"[" + (i+1) + "]");
                System.out.println("Transactions");
                if (printTransaction) {
                    for (int j=0; j<customer.getTransactions().size(); j++) {
                        System.out.println("[" + (j+1) + "] " + "Amount" + " " + customer.getTransactions().get(j));
                    }
                }
            }
            return true;
        }
    }
}
