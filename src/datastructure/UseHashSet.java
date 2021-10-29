package datastructure;

import java.util.HashSet;
import java.util.Set;

public class UseHashSet {
    public static void main(String[] args) {
        Set<Integer> hs = new HashSet<>();
        hs.add(7);
        hs.add(3);
        hs.add(1);
        hs.add(6);
        System.out.println(hs);
        // use for loop if you want access to all these numbers one by one
        //also order doesn't matter
        //if you have dupes, it'll ignore the extra ones

    }
}
