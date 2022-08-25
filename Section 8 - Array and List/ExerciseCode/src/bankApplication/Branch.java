package bankApplication;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String nameOfBranch) {
        this.name = nameOfBranch;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double initialTransaction) {
        if (this.findCustomer(customerName) == null) {
            Customer customer = new Customer(customerName, initialTransaction);
            customers.add(customer);
            return true;
        } else {
            return false;
        }
    }

    public boolean addCustomerTransaction(String customerName, double transaction) {
        if (this.findCustomer(customerName) == null) {
            return false;
        } else {
            Customer customer = findCustomer(customerName);
            return true;
        }
    }

    public Customer findCustomer(String customerName) {
        for (int i=0; i<customers.size(); i++) {
            if (customers.get(i).getName() == customerName) {
                return customers.get(i);
            }
        }
        return null;
    }
}
