package com.seiha;

import com.series.Calculate;

public class Main {

    public static void main(String[] args) {
        Calculate cal = new Calculate();
        long sum = cal.nSum(10);
        System.out.println("=> sum is: "+sum);
        cal.factorial(10);
        System.out.println();
        cal.fibonacci(10);
    }
}
