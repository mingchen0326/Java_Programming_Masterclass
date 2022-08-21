package phone;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {
        if(findContact(contact.getName()) >= 0) {
            System.out.println("Contact is already on file");
            return false;
        }
        this.myContacts.add(contact);
        return true;
    }

    public boolean updateContact (Contact oldContact, Contact newContact) {
        int position = findContact(oldContact);
        if (position < 0) {
            System.out.println(oldContact.getName() + ", was not found");
            return false;
        } else {
            this.myContacts.set(position, newContact);
            System.out.println(oldContact.getName() + ", was replaced with " + newContact.getName());
            return true;
        }
    }

    public boolean removeContact(Contact contact) {
        int position = findContact(contact);
        if (position < 0) {
            System.out.println(contact.getName() + ", was not found");
            return false;
        } else {
            this.myContacts.remove(position);
            System.out.println(contact.getName() + ", was deleted");
            return true;
        }
    }
    private int findContact(String name) {
        for (int i=0; i<myContacts.size(); i++) {
            if (this.myContacts.get(i).getName() == name) {
                return i;
            }
        }
        return -1;
    }

    private int findContact(Contact contact) {
        return this.myContacts.indexOf(contact);
    }

    public String queryContact(Contact contact) {
        if (findContact(contact) >= 0) {
            return contact.getName();
        }
        return null;
    }

    public Contact queryContact(String name) {
        if (findContact(name) >= 0) {
            int position = findContact(name);
            return myContacts.get(position);
        }
        return null;
    }

    public void printContact() {
        System.out.println("Contact List");
        for (int i=0; i<this.myContacts.size(); i++) {
            System.out.println((i+1) + ". " +
                    this.myContacts.get(i).getName() + " --> " +
                    this.myContacts.get(i).getPhoneNumber());
        }
    }
}
