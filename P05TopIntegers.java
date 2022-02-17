package ArraysExercise;

import java.util.Scanner;

public class P05TopIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] array = sc.nextLine().split(" ");
        int[] arrayNumbers = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            arrayNumbers[i] = Integer.parseInt(array[i]);
        }
        for (int i = 0; i < arrayNumbers.length; i++) {
            boolean isTop = true;
            for (int j = i + 1; j < arrayNumbers.length; j++) {
                if (arrayNumbers[i] <= arrayNumbers[j]) {
                    isTop = false;
                    break;
                }
            }
            if (isTop) {
                System.out.print(arrayNumbers[i] + " ");
            }
        }
    }
}
