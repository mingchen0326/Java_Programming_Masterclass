import java.util.ArrayList;

public class Video112 {
    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Tim");

        // The long way to add integer
        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for (int i=0; i<=10; i++) {
            intArrayList.add(Integer.valueOf(i));
        }
        for (int i=0; i<=10; i++) {
            System.out.println(i + " --> " + intArrayList.get(i).intValue());
        }

        // shorter way
        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for (double dbl=0.0; dbl<=10.0; dbl += 0.5) {
            myDoubleValues.add(Double.valueOf(dbl));
        }

        for (int i=0; i<myDoubleValues.size(); i++) {
            double value = myDoubleValues.get(i).doubleValue();
        }


    }
}
