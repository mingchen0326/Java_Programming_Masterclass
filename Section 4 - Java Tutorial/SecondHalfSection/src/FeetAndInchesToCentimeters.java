public class FeetAndInchesToCentimeters {
    public static double calFeedAndInchesToCentimeters(double feet, double inches) {
        if (feet >= 0 && inches >= 0 && inches <= 12) {
            double centimeters = feet * 30.48 + inches * 2.54;
            System.out.println(feet + " feet,  " + inches + " inches = " + centimeters + " centimeters");
            return centimeters;
        }
        return -1;
    }

    public static double calFeedAndInchesToCentimeters(double inches) {
        if (inches >= 0) {
            double new_feet = inches / 12;
            double new_inches = inches % 12;
            return calFeedAndInchesToCentimeters(new_feet, new_inches);
        }
        return -1;
    }
}
