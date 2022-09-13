package collection_framework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class Main {
}
class LearnStack {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();
        animals.push("tiger");
        animals.push("Lion");
        animals.push("Horse");
        animals.push("Cat");
        System.out.println(animals.peek());
        System.out.println(animals.pop());
        System.out.println(animals.peek());
    }
}
class LearnArrayList {
    public static void main(String[] args) {
        //New Size - n + n/2 + 1
        List<Integer> list = new ArrayList<>();
        System.out.println(list.size());
        list.add(4);
        list.add(9);
        list.add(2);
        System.out.println(list);
        list.add(2,99); // at particular index
        System.out.println(list);

        List<Integer> nwlist = new ArrayList<>();
        nwlist.add(77);
        nwlist.add(55);

        list.addAll(nwlist); // Add another collection
        System.out.println(list);

        System.out.println(list.get(2)); // get element at index 2

        list.remove(Integer.valueOf(55));// removes element
        list.remove(0); // removes at 0 index
        System.out.println(list);

//        list.clear();
        System.out.println(list);

        list.set(1,888);
        System.out.println(list);

        System.out.println(list.contains(9));

        for(Integer element:list) {
            System.out.println("Elements " + element);
        }

        Iterator<Integer> it = list.iterator();
        while(it.hasNext()) {
            System.out.println("Iterator " + it.next());
        }
    }
}

