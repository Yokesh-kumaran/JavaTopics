package N_JavaTask;

import java.util.Scanner;

public class PairArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of an array: ");
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];

        int index = 0;
        while (index < array.length) {
            System.out.println("Enter the value of index " + index);
            int userInput = scanner.nextInt();
            array[index] = userInput;
            index += 1;
        }

        System.out.println("Enter the sum value: ");
        int sum = scanner.nextInt();
        boolean var = false;
        for (int i = 0; i < arrayLength; i++) {
            for (int j = i + 1; j < arrayLength; j++) {
                if (array[i] + array[j] == sum) {
                    var = true;
                    System.out.println("True ( " + array[i] + " " + array[j] + " are the pairs with sum " + sum + " )");
                } else {
                    continue;
                }
            }
        }
        if (var == false) {
            System.out.println("There are no pair elements");
        }
    }
}