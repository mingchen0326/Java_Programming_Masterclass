public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes + " KB = "
                    + kiloBytes / 1024 + " MB and "
                    + kiloBytes % 1024 + " KB ");
        }

//        //the following code use ternary operator for same purpose
//        System.out.println(kiloBytes > 0 ? kiloBytes + " KB = "
//                + kiloBytes / 1024 + " MB and "
//                + kiloBytes % 1024 + " KB " : "Invalid Value");
    }
}
