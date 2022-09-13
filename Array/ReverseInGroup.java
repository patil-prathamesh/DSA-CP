package Array;

import java.util.ArrayList;

public class ReverseInGroup {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(56);
        l.add(12);
        System.out.println(l);
        swap(l);
        System.out.println(l);
    }
    static void swap(ArrayList<Integer>list) {
        list.set(0,67);
    }
}
class Solution {
    //Function to reverse every sub-array group of size k.
    void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        int start = 0;
        int end = k-1;
        for(int i = 1; i <= (n/k); i++) {
            swap(start,end,arr);
            start = end + 1;
            end = end + k;
        }
        swap(n-(n%k),n-1,arr);
    }
    void swap(int start,int end, ArrayList<Integer> arr) {
        while(start < end) {
            int temp = arr.get(start);
            arr.add(start,arr.get(end));
            arr.add(end,temp);
            start++;
            end--;
        }
    }
}
