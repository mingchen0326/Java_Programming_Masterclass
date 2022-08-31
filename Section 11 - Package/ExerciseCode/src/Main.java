import staticDemo.StaticTest;

public class Main {
    public static void main(String[] args) {
//        Account timsAccount = new Account("Tim");
//        timsAccount.deposit(1000);
//        timsAccount.withdraw(500);
//        timsAccount.withdraw(-200);
//        timsAccount.deposit(-20);
//        timsAccount.calculateBalanec();
//
//        System.out.println("Balance on account is " + timsAccount.getBalance());

        StaticTest firstInstance = new StaticTest("1st Instance");
        System.out.println(firstInstance.getName() + " is instance number " + firstInstance.getName());

        StaticTest secondInstance = new StaticTest("2nd Instance");
        System.out.println(secondInstance.getName() + " is instance number " + secondInstance.getName());

        StaticTest thirdInstance = new StaticTest("3rd Instance");
        System.out.println(thirdInstance.getName() + " is instance number " + thirdInstance.getName());
    }
}