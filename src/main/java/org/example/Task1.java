package org.example;

public class Task1 {
    public static void main(String[] args) {
        int[] temp = {36, 52, 39, 42, 35, 41, 58};
        int max = temp[0];
        int min = temp[0];
        for (int t : temp) {
            if (max < t) {
                max = t;

            }
            if (min > t) {
                min = t;

            }

        }
        System.out.println("Highest temperature is " + max);
        System.out.println("Lowest temperature is " + min);

    }
}
