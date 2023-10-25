package N_JavaTask;

import java.util.ArrayList;

public class PrimeNumber {
    public static void main(String[] args) {
        int end = 100;
        ArrayList<Integer> list = new ArrayList<>(100);
        list.add(2);

        for(int i=3; i<=end; i++){
            int flag=0;
            for(int j=2; j<i; j++){
                if(i%j == 0){
                    flag += 1;
                    break;
                }
            }
            if(flag == 0){
                list.add(i);
            }
        }

        System.out.println("The prime numbers between 1 to 100 are: ");
        for(int prime: list){
            System.out.println(prime);
        }
    }
}
