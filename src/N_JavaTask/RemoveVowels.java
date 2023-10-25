package N_JavaTask;

import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String input = scanner.nextLine().toLowerCase();
        StringBuilder sb=new StringBuilder();
        sb.append(input);
        String vowel = "aeiou";
        for(int i=0; i<sb.length(); i++){
            for(int j=0; j<vowel.length(); j++){
                if(sb.charAt(i) == vowel.charAt(j)){
                    sb.deleteCharAt(i);
                }
            }
        }
        System.out.println("\n");
        System.out.println("The string without vowel:");
        System.out.println(sb);
    }
}
