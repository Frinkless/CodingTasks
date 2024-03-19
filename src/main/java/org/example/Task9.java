package org.example;

import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {

        int [] numbers = {36, 52, 39, 42, 56, 35, 41, 58, -11};
        int size = numbers.length;
        Arrays.sort(numbers);
        int max2 = numbers[size-2];
        System.out.println("The second largest number is: " + max2);


        //The original array is:
        //5 -2 23 7 87 -42 509
        //The sorted array is:
        //-42 -2 5 7 23 87 509

    }
}

