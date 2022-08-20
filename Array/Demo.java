package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ArrayList<Integer> al = new ArrayList<>();
        // al.add(3);
        // al.add(13);
        // al.add(43);
        // al.add(73);
        // // System.out.println(search(al,90));
        // System.out.println(al);
        // search(al,8);
        // System.out.println(al);
        int[] arr = {5,6,7,8};
        System.out.println(Arrays.toString(arr));
        search(arr);
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
    static void search(ArrayList<Integer> al,int k) {
        al.set(0,4);
    }
    static void search(int[] arr) {
        arr[0] = 9;
    }
}