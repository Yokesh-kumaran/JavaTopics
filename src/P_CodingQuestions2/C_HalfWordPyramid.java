package P_CodingQuestions2;

import java.util.Scanner;

public class C_HalfWordPyramid {
    public static void main(String[] args) {
        int i, j, len, ascii = 65;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length: ");
        len = scanner.nextInt();
        for (i = 0; i < len; i++) {
            for (j = 0; j <= i; j++) {
                char c = (char) ascii;
                System.out.print(c + " ");
            }
            ascii += 1;
            System.out.println();
        }
    }
}
