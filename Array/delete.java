package Array;

import java.util.Arrays;

public class delete {
    public static void main(String[] args) {
        int[] arr = {3,5,12,8,6};
        int x = 12;
        int j=-1;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == x) {
                j = i;
                break;
            }
        }
        for(int k = j; k < arr.length-1; k++) {
            arr[k] = arr[k+1];
        }
        System.out.println(Arrays.toString(arr));
    }
}
