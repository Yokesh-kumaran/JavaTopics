package N_JavaTask;

import java.util.Scanner;

public class SubstringOccCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the main string: ");
        String mainString = scanner.nextLine();
        System.out.println("Enter the sub string: ");
        String subString = scanner.nextLine();

        boolean result = false;
        int count = 0;
        for(int i=0; i<mainString.length(); i++){
            if(subString.charAt(0) == mainString.charAt(i)){
                for(int j=0; j<subString.length(); j++){
                    if(subString.charAt(j) == mainString.charAt(i)){
                        result = true;
                        i++;
                    }
                    else{
                        result = false;
                    }
                }
                if(result == true){
                    count += 1;
                }
            }
            else{
                continue;
            }
        }

        System.out.println(subString+" occurs "+count+" times.");
    }
}
