package P_CodingQuestions2;

import java.util.Scanner;

public class F_FullStarPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int len = scanner.nextInt();
        for (int i = 0; i < len; i++) {
            for (int j = len; j > i + 1; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
