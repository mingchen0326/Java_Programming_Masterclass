package phone;

public class Contact {
    private String name;
    private String phoneNumber;

    public Contact() {
    }

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static Contact createContact(String newName, String newNumber) {
        return new Contact(newName, newNumber);
    }

//    public void removePhoneNumber(int position) {
//        String nameToBeDeleted = nameList.get(position);
//        String numberToBeDeleted = phoneNumberList.get(position);
//        nameList.remove(nameToBeDeleted);
//        phoneNumberList.remove(numberToBeDeleted);
//    }
//
//    public void modifyPhoneNumber(int position, String newNumber) {
//        phoneNumberList.set(position, newNumber);
//    }
}
