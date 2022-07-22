package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {
        // video 29. float and double Primitive Types
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        int myIntValue = 5 / 2;
        float myFloatValue = 5f / 2f;
        double myDoubleValue = 5d / 2d;
        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        // -----------------------------------------------------------------------------------------------------------
        // Video 30. Floating Point Precision and a Challenge
        float pound = 5.0f;
        float kilogram = pound * 0.45359237f;
        System.out.println(kilogram);

        // -----------------------------------------------------------------------------------------------------------
        // Video 31. The char and boolean Primitive Dat Types
        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        char myCopyrightChar = '\u00A9';
        System.out.println(myCopyrightChar);

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;
        boolean isCustomerOverTwentyOne = true;

        // -----------------------------------------------------------------------------------------------------------
        // Video 32. Primitive Types Recap and the String Data Type
        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("Last String is equal to " + lastString);

        // -----------------------------------------------------------------------------------------------------------
        // Video 33. Operator, Operands and Expression
        int result = 1 + 2; // 1 + 2 =3
        System.out.println(" 1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1; // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);

        result = result * 10; // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5; // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        // -----------------------------------------------------------------------------------------------------------
        // Video 34. Abbreviating Operators
        result++;
        System.out.println("result + 1 = " + result);

        result--;
        System.out.println("result - 1 = " + result);

        result += 2;
        System.out.println("result  1 = " + result);
    }
}