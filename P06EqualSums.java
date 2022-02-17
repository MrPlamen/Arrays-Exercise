package ArraysExercise;

import java.util.Scanner;

public class P06EqualSums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] array = input.split(" ");
        int[] arrayNumbers = new int[array.length];
        int sum1 = 0;
        int sum2 = 0;
        boolean isThere = false;

        for (int i = 0; i < array.length; i++) {
            arrayNumbers[i] = Integer.parseInt(array[i]);
        }
        for (int j = 0; j < arrayNumbers.length; j++) {
            for (int k = 0; k < j; k++) {
                sum1 += arrayNumbers[k];
            }
            for (int l = j+1; l < arrayNumbers.length; l++) {
                sum2 += arrayNumbers[l];
            }
            if (sum1 == sum2) {
                System.out.println(j);
                isThere = true;
            }
            sum1 = 0;
            sum2 = 0;
        }
        if (!isThere) {
            System.out.println("no");
        }
    }
}
