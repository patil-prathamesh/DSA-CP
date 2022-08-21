package Array;

import java.util.Arrays;

public class LeftRotateBy1 {
    public static void main(String[] args) {
        int[] arr = {30,5,20};
        leftRotate(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void leftRotate(int[] arr) {
        int first = arr[0];
        for(int i = 1; i < arr.length; i++) {
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = first;
    }
}
