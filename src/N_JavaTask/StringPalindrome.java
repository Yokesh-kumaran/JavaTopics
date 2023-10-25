package N_JavaTask;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String input = scanner.nextLine().toLowerCase();
        String inputReverse = "";
        for(int i=0; i<input.length(); i++){
            inputReverse = input.charAt(i) + inputReverse;
        }
        if(input.equals(inputReverse)){
            System.out.println("The given string is palindrome");
        }
        else{
            System.out.println("The given string is not palindrome");
        }
    }
}
