package com.ming.series;

import java.util.LinkedList;

public class Series {


    public Series() {

    }

    public static int nSum(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n;
            n -= 1;
        }
        return sum;
    }

    public static int factorial(int n) {
        int product = 1;
        while (n != 1) {
            product *= n;
            n -= 1;
        }
        return product;
    }

    public static <Int> int fibonacci(int n) {
        LinkedList<Integer> fibo = new LinkedList<Integer>();;
        fibo.add(0, 0);
        fibo.add(1,1);
        int index = 2;
        while (index <= n) {
            fibo.add(index, fibo.get(index-1) + fibo.get(index-2));
            index++;
        }
        return fibo.get(n);
    }
}
