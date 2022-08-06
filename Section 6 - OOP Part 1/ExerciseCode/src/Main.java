public class Main {
    public static void main(String[] args) {
        BankAccount bobsAccount = new BankAccount("12345", 0.00, "bob brown",
                "myemail@gmail.com", "(123)-123-4567");
        System.out.println(bobsAccount.getAccountNumber());
    }
}