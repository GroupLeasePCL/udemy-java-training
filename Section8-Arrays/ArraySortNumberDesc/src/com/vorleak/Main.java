package com.vorleak;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i, temp;
        int[] arrayInt = new int[5];
        for (i = 0; i < arrayInt.length; i++){
            System.out.println("Input number "+(i+1)+" ");
            arrayInt[i] = scanner.nextInt();

        }
        //Arrays.sort(arrayInt);

        for (i = 0; i < arrayInt.length; i++){

            for (int j = i + 1; j < arrayInt.length; j++)
            {
                if (arrayInt[i] < arrayInt[j])
                {
                    temp = arrayInt[i];
                    arrayInt[i] = arrayInt[j];
                    arrayInt[j] = temp;
                }
            }
        }
        for (i = 0; i < arrayInt.length; i++) {
            System.out.println("ArrayInt position " + i + " = " + arrayInt[i]);
        }
    }
}
