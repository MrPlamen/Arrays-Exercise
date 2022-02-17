package ArraysExercise;

import java.util.Scanner;

public class P03ZigZagArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lines = Integer.parseInt(sc.nextLine());
        int[] array1 = new int[lines];
        int[] array2 = new int[lines];

        for (int i = 1; i <= lines; i++) {
            if (i%2 != 0) {
                array1[i-1] = sc.nextInt();
                array2[i-1] = sc.nextInt();
            } else {
                array2[i-1] = sc.nextInt();
                array1[i-1] = sc.nextInt();
            }
        }
        for (int j : array1) {
            System.out.print(j + " ");
        }
        System.out.println();
        for (int q : array2) {
            System.out.print(q + " ");
        }
    }
}
