package P_CodingQuestions2;

import java.util.Scanner;

public class B_HalfNumPyramid {
    public static void main(String[] args) {
        int i, j;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int len = scanner.nextInt();
        for (i = 0; i < len; i++) {
            for (j = 1; j <= i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
