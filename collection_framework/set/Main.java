package collection_framework.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main {
}
class LearnTreeSet {
    public static void main(String[] args) {
        //all operations in O(log n)   Binary search tree
        TreeSet<Integer> set = new TreeSet<>();
        set.add(5);
        set.add(2);
        set.add(8);
        set.add(7);
        set.add(7);
        System.out.println(set);
    }
}
class LearnLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> ls = new LinkedHashSet<>();
        ls.add(3);
        ls.add(4);
        ls.add(6);
        ls.add(6);
        System.out.println(ls);
    }
}
class LearnHashSet {
    public static void main(String[] args) {
        //all operations in O(1)
        HashSet<Integer> set = new HashSet<>();
        set.add(3);
        set.add(13);
        set.add(34);
        set.add(34);
        System.out.println(set);
        set.remove(34);
        System.out.println(set);
        System.out.println(set.contains(3));
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        set.clear();
    }
}
