package ArraysExercise;

import java.util.Scanner;

public class P07MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] array = sc.nextLine().split(" ");
        int[] arrayNumbers = new int[array.length];
        int streak = 1;
        int number = 0;
        int maxStreak = 1;

        for (int j = 0; j < array.length; j++) {
            arrayNumbers[j] = Integer.parseInt(array[j]);
        }
        for (int i = 1; i < array.length; i++) {
            if (arrayNumbers[i] == arrayNumbers[i - 1]) {
                streak++;
                if (streak > maxStreak) {
                    maxStreak = streak;
                    number = arrayNumbers[i];
                }
            } else {
                streak = 1;
            }
        }
        for (int k = 1; k <= maxStreak; k++) {
            System.out.print(number + " ");
        }
    }
}
