package org.example;

public class Task4 {
    public static void main(String[] args) {
        int[][] value = {{36, 52, 39, 42},
                        {56, 35, 41, 58}};
        int sumEven = 0;
        int sumOdd=0;
        for (int i=0; i< value.length; i++) {
            for(int j=0; j< value[i].length; j++)
            if(value[i][j]%2==0){
                sumEven+=value[i][j];

            }else{
                sumOdd+=value[i][j];
            }


        }
        System.out.println("Sum of even numbers is "+sumEven);
        System.out.println("Sum of odd numbers is "+sumOdd);

    }
}




