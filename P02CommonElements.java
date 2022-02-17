package ArraysExercise;

import java.util.Scanner;

public class P02CommonElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String input2 = sc.nextLine();
        String[] array = input.split(" ");
        String[] array2 = input2.split(" ");

        for (String var : array) {
            for (String var2 : array2) {
                if (var.equals(var2)) {
                    System.out.print(var + " ");
                }
            }
        }
    }
}
