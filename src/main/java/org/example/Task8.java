package org.example;

public class Task8 {
    public static void main(String[] args) {
        int[] number = {36, 52, 39, 42, 56, 35, 41, 58, -11};
        int max = number[0];
        int min = number[0];
        for (int i = 0; i < number.length; i++) {

            if (max < number[i]) {
                max = number[i];

            }
            if (min > number[i]) {
                min = number[i];
            }

        } System.out.println("Maximum number is " + max);
        System.out.println("Minimum number is " + min);

    }

}


