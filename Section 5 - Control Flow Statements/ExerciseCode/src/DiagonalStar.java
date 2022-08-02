public class DiagonalStar {
    public static void printSquareStar (int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            for (int row = 1; row < number+1; row++) {
                for (int column = 1; column < number+1; column++) {
                    if (row == 1 || row == number ) {
                        System.out.print("*");
                    } else if (column == 1 || column == number) {
                        System.out.print("*");
                    } else if (row == column) {
                        System.out.print("*");
                    } else if (number - row + 1 == column) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
