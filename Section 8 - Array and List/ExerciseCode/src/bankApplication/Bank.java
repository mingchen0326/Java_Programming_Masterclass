package bankApplication;

import java.util.ArrayList;

public class Bank {
    private String name;
    ArrayList<Branch> branches;

    public Bank(String nameOfBank) {
        this.name = nameOfBank;
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

    public Branch findBranch(String nameOfBranch) {
        for (int i=0; i<branches.size(); i++) {
            if (branches.get(i).getName() == nameOfBranch) {
                return branches.get(i);
            }
        }
        return null;
    }

    public boolean listCustomer(String nameOfBranch, boolean printTransaction) {
        if (this.findBranch(nameOfBranch) == null) {
            return false;
        } else {
            Branch branch = this.findBranch(nameOfBranch);
            for (int i=0; i<branch.getCustomers().size(); i++) {
                Customer customer = branch.getCustomers().get(i);
                System.out.println(i + ". " + customer.getName());
                if (printTransaction) {
                    for (int j=0; j<customer.getTransactions().size(); j++) {
                        System.out.println("Transaction " + j + ". " + customer.getTransactions().get(j));
                    }
                }
            }
            return true;
        }
    }
}
