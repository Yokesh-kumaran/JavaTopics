package M_Collection;

import java.util.TreeSet;

public class M_HashSet {
    public static void main(String[] args) {
        TreeSet<String> treeset = new TreeSet<>();
        treeset.add("Yokesh");
        treeset.add("Sanjay");
        treeset.add("Akshaya");
        treeset.add("yokesh");
        treeset.add("sanjay");
        treeset.add("akshaya");
        for(String name: treeset){
            System.out.println(name);
        }
    }
}
