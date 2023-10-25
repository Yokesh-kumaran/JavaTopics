package N_JavaTask;

import java.util.Scanner;

public class SubsetArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of an array 1: ");
        int array1Length = scanner.nextInt();
        System.out.println("Enter the length of an array 2: ");
        int array2Length = scanner.nextInt();

        int[] array1 = new int[array1Length];
        int[] array2 = new int[array2Length];

        int[] array1New =  new int[array1Length];
        int[] array2New = new int[array2Length];

        if (array1Length > array2Length) {
            int index1 = 0;
            System.out.println("\n");
            System.out.println("Enter the values of first array, repeated elements will not accepted:");
            while (index1 < array1Length) {
                System.out.println("Enter the value of index " + index1);
                int userInput = scanner.nextInt();
                array1[index1] = userInput;
                index1 += 1;
            }

            int index2 = 0;
            System.out.println("\n");
            System.out.println("Enter the values of second array, repeated elements will not accepted:");
            while (index2 < array2Length) {
                System.out.println("Enter the value of index " + index2);
                int userInput = scanner.nextInt();
                        array2[index2] = userInput;
                        index2 += 1;
            }
        } else {
            System.out.println("Second array should not greater than first array...");
        }

        boolean check = false;
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                if (array2[i] == array1[i]) {
                    check = true;
                } else {
                    check = false;
                }
            }
        }

        if (check == true) {
            System.out.println("Array2 is the subset of array1");
        } else {
            System.out.println("Array2 is not the subset of array1");
        }
    }
}
