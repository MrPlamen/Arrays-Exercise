package ArraysExercise;

import java.util.Scanner;

public class P8MagicSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] array = sc.nextLine().split(" ");
        int[] arrayNumbers = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            arrayNumbers[i] = Integer.parseInt(array[i]);
        }
        int number = Integer.parseInt(sc.nextLine());
        for (int k = 0; k < arrayNumbers.length; k++) {
            for (int j = k + 1; j < arrayNumbers.length; j++) {
                if ((arrayNumbers[k] + arrayNumbers[j]) == number) {
                    System.out.println(arrayNumbers[k] + " " + arrayNumbers[j]);
                }
            }
        }
    }
}
