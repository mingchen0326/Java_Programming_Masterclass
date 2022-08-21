import phone.Contact;
import phone.MobilePhone;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("0039 330 4404");

    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        printActions();
        while (!quit) {
            System.out.println("\n Enter action: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContact();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }
    }
    private static void startPhone() {
        System.out.println("Starting phone");
    }

    private static void addNewContact() {
        System.out.println("Enter new contact name: \n");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact number: \n");
        String newPhoneNumber = scanner.nextLine();
        Contact newContact = new Contact(newName, newPhoneNumber);
        if (mobilePhone.addNewContact(newContact)) {
            System.out.println(newName + ": " + newPhoneNumber + " added to mobile phone contact");
        } else {
            System.out.println(newName + ": " + newPhoneNumber + " cannot be added to mobile phone contact");
        }
    }

    private static void updateContact() {
        System.out.println("Enter old contact name: \n");
        String oldName = scanner.nextLine();
        System.out.println("Enter new contact name: \n");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact number: \n");
        String newPhoneNumber = scanner.nextLine();
        Contact newContact = new Contact(newName, newPhoneNumber);
        if (mobilePhone.queryContact(oldName) == null) {
            System.out.println(oldName + ". did not exist in mobile phone contact");
        } else {
            Contact oldConact = mobilePhone.queryContact(oldName);
            mobilePhone.updateContact(oldConact, newContact);
        }
    }

    private static void removeContact() {
        System.out.println("Enter old contact name: \n");
        String oldName = scanner.nextLine();
        if (mobilePhone.queryContact(oldName) == null) {
            System.out.println(oldName + " did not exist in mobile phone contact");
        } else {
            Contact oldConact = mobilePhone.queryContact(oldName);
            mobilePhone.removeContact(oldConact);
        }
    }

    private static void queryContact() {
        System.out.println("Enter old contact name: \n");
        String oldName = scanner.nextLine();
        System.out.println("Enter old contact number: \n");
        String oldPhoneNumber = scanner.nextLine();
        if (mobilePhone.queryContact(oldName) == null) {
            System.out.println(oldName + ": " + oldPhoneNumber + ". did not exist in mobile phone contact");
        } else {
            Contact oldConact = mobilePhone.queryContact(oldName);
            System.out.println("Name: " + oldConact.getName());
            System.out.println("Phone Number: " + oldConact.getPhoneNumber());
        }
    }

    private static void printActions() {
        System.out.println("\nAvailable actions: \npress");
        System.out.println("0 - to shutdown\n" +
                            "1 - to print contacts\n" +
                            "2 - to add a new contact\n" +
                            "3 - to update existing an existing contact\n" +
                            "4 - to remove an existing contact\n" +
                            "5 - query if an existing contact exists\n" +
                            "6 - to print a list of available actions.");
        System.out.println("Choose your action: ");
    }
}