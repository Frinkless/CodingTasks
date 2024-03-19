package org.example;

public class Task3 {
    public static void main(String[] args) {
        int[][] value = {{36, 52, 39, 42},
                {56, 35, 41, 58}};
        for (int i = 0; i < value.length; i++) {
            for (int j = 0; j < value[0].length; j++)
                if (value[i][j] % 2 == 0) {
                    System.out.print(value[i][j] + " ");
                }
        }
    }
}
