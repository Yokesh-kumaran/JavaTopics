package N_JavaTask;

import java.util.Scanner;

public class CharOccurenceCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String string = scanner.nextLine().toLowerCase();
        System.out.println("Enter the Character to find: ");
        char charInput = Character.toLowerCase(scanner.next().charAt(0));

        int count = 0;

        //LOOPING THE STRING
        for(int i=0; i<string.length(); i++){
            if(string.charAt(i) == charInput){
                count += 1;
            }
        }

        System.out.println(charInput+" occurs "+count+" times");
    }
}
