package P_CodingQuestions2;

import java.util.Scanner;

public class A_HalfStarPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the pyramid: ");
        int len = scanner.nextInt();
        int i, j;
        for (i = 0; i < len; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
