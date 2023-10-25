package M_Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class M_Set {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> set1 = new HashSet<>();

        System.out.println("ADDING IN SET");
        set.add(10);
        set.add(11);
        set.add(20);
        set.add(12);
        for(int i: set){
            System.out.println(i);
        }
        System.out.println("---------------------------");

        System.out.println("SIZE IN SET");
        int size = set.size();
        System.out.println(size);
        System.out.println("---------------------------");

        System.out.println("REMOVING OBJECT");
        set.remove(10);
        for(int i: set){
            System.out.println(i);
        }
        System.out.println("---------------------------");

        System.out.println("ITERATOR");
        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("---------------------------");

        System.out.println("ADD ALL");
        set1.add(100);
        set1.add(200);
        set.addAll(set1);
        for(int i: set){
            System.out.println(i);
        }
        System.out.println("---------------------------");
    }
}
