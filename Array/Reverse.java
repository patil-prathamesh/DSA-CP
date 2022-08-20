package Array;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = {20};
        reversePro(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr) {
        int[] temp = new int[arr.length];
        for(int i = 0; i < temp.length; i++) {
            temp[i] = arr[arr.length-1-i];
        }
        for(int i = 0; i < temp.length; i++) {
            arr[i] = temp[i];
        }
    }
    static void reversePro(int[] arr) {
        int low = 0;
        int high = arr.length-1;
        while(low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
}
