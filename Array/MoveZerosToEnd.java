package Array;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {10,20};
        moveZerosToEnd(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void moveZerosToEnd(int[] arr) {
        int[] temp = new int[arr.length];
        Arrays.fill(temp,0,arr.length,0);
        int i = 0;
        for(int num : arr) {
            if(num != 0) {
                temp[i] = num;
                i++;
            }
        }
        for(int j = 0; j < arr.length; j++) {
            arr[j] = temp[j];
        }
    }
}