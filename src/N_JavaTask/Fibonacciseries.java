package N_JavaTask;

import java.util.Scanner;

public class Fibonacciseries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fibonacci series length?: ");
        int input = scanner.nextInt();
        int[] array = new int[input];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i < array.length; i++) {
            array[i] = array[i - 2] + array[i - 1];
        }
        for (int i : array) {
            System.out.println(i);
        }
    }
}
