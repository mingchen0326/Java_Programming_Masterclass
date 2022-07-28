public class Main {
    public static void main(String[] args) {

        // the follow code test SpeedConverter class
        double speed1 = 1.5;
        double speed2 = 10.25;
        double speed3 = -5.6;
        double speed4 = 25.42;
        double speed5 = 75.114;
        SpeedConverter.printConversion(speed1);
        SpeedConverter.printConversion(speed2);
        SpeedConverter.printConversion(speed3);
        SpeedConverter.printConversion(speed4);
        SpeedConverter.printConversion(speed5);

        // the following code test MegaBytesConverter class
        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);
        MegaBytesConverter.printMegaBytesAndKiloBytes(-1024);
        MegaBytesConverter.printMegaBytesAndKiloBytes((5000));

        // the following code test BarkingDog class
        boolean wakeUp1 = BarkingDog.shouldWakeUp(true, 1);
        boolean wakeUp2 = BarkingDog.shouldWakeUp(false, 2);
        boolean wakeUp3 = BarkingDog.shouldWakeUp(true, 8);
        boolean wakeUp4 = BarkingDog.shouldWakeUp(true, -1);
        System.out.println(wakeUp1);
        System.out.println(wakeUp2);
        System.out.println(wakeUp3);
        System.out.println(wakeUp4);

        // the following code test LeapYear class
        boolean isLeap1 = LeapYear.isLeapYear(1700);
        boolean isLeap2 = LeapYear.isLeapYear(1800);
        boolean isLeap3 = LeapYear.isLeapYear(1900);
        boolean isLeap4 = LeapYear.isLeapYear(2100);
        boolean isLeap5 = LeapYear.isLeapYear(2200);
        boolean isLeap6 = LeapYear.isLeapYear(2300);
        boolean isLeap7 = LeapYear.isLeapYear(2500);
        boolean isLeap8 = LeapYear.isLeapYear(2600);
        System.out.println("year is " + isLeap1);
        System.out.println("year is " + isLeap2);
        System.out.println("year is " + isLeap3);
        System.out.println("year is " + isLeap4);
        System.out.println("year is " + isLeap5);
        System.out.println("year is " + isLeap6);
        System.out.println("year is " + isLeap7);
        System.out.println("year is " + isLeap8);

        boolean isLeap9 = LeapYear.isLeapYear(1600);
        boolean isLeap10 = LeapYear.isLeapYear(2000);
        boolean isLeap11 = LeapYear.isLeapYear(2400);
        System.out.println("year is " + isLeap9);
        System.out.println("year is " + isLeap10);
        System.out.println("year is " + isLeap11);

        // the following code test DecimalComparator
        System.out.println("The answer is: " + DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println("The answer is: " + DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println("The answer is: " + DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println("The answer is: " + DecimalComparator.areEqualByThreeDecimalPlaces(-3.123, 3.123));

        // the following code test EqualSumChecker
        System.out.println("The hasEqualSum method test answer is: " + EqualSumChecker.hasEqualSum(1, 1, 1));
        System.out.println("The hasEqualSum method test answer is: " + EqualSumChecker.hasEqualSum(1, 1, 2));
        System.out.println("The hasEqualSum method test answer is: " + EqualSumChecker.hasEqualSum(1, -1, 0));

        // the following code test TeenNumberChecker
        System.out.println("The hasTeen method test answer is: " + TeenNumberChecker.hasTeen(9, 99, 19));
        System.out.println("The hasTeen method test answer is: " + TeenNumberChecker.hasTeen(23, 15, 42));
        System.out.println("The hasTeen method test answer is: " + TeenNumberChecker.hasTeen(22, 23, 24));

        // the following code test SecondsAndMinute
        System.out.println("Time Conversion result is " + SecondsAndMinutesChallenge.getDurationString(120, 0));
        System.out.println("Time Conversion result is " + SecondsAndMinutesChallenge.getDurationString(-60, 0));
        System.out.println("Time Conversion result is " + SecondsAndMinutesChallenge.getDurationString(90, 30));

        System.out.println("Time Conversion result is " + SecondsAndMinutesChallenge.getDurationString(7200));
        System.out.println("Time Conversion result is " + SecondsAndMinutesChallenge.getDurationString(-3600));
        System.out.println("Time Conversion result is " + SecondsAndMinutesChallenge.getDurationString(5430));


    }
}
