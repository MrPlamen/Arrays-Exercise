package ArraysExercise;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class P04ArrayRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] array = sc.nextLine().split(" ");
        int rotations = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < rotations; i++) {
            String firstElement = array[0];
            for (int j = 0; j < array.length - 1; j++) {
                array[j] = array[j + 1];
            }
            array[array.length - 1] = firstElement;
        }
        for (String var : array) {
            System.out.print(var + " ");
        }
    }
}
