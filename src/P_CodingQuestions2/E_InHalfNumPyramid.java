package P_CodingQuestions2;

import java.util.Scanner;

public class E_InHalfNumPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int len = scanner.nextInt();
        for (int i = len; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
