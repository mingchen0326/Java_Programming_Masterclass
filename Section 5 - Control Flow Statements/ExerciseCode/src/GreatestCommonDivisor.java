public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor (int first, int second) {
        if (first >= 10 && second >= 10) {
            int commonDivisor = 0;
            if (first > second) {
                commonDivisor = second;
            } else {
                commonDivisor = first;
            }
            while (commonDivisor > 0) {
                if (first % commonDivisor == 0 && second % commonDivisor == 0) {
                    return commonDivisor;
                }
                commonDivisor--;
            }
        }
        return -1;
    }
}
