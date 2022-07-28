public class SecondsAndMinutesChallenge {
    public static String getDurationString (int minutes, int seconds) {
        int resultHour = minutes / 60;
        int resultMinute = minutes % 60;
        return (minutes >= 0 && seconds >= 0 && seconds <= 59) ? resultHour + "h " + resultMinute + "m " + seconds + "s" : "Invalid Value";
    }

    public static String getDurationString (int seconds) {
        int resultMinute = seconds / 60;
        int resultSecond = seconds % 60;
        return seconds >= 0 ? getDurationString(resultMinute, resultSecond) : "Invalid Value";
    }
}
