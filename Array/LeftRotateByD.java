package Array;
import java.util.Arrays;
public class LeftRotateByD {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        optimized(arr,2);
        System.out.println(Arrays.toString(arr));
    }
    static void optimized(int[] arr,int d) {
        reverse(arr, 0, d-1);
        reverse(arr, d, arr.length-1);
        reverse(arr, 0, arr.length-1);
    }
    static void reverse(int[] arr,int start,int end) {
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    static void leftRotateByD(int[] arr,int d) {
        int n = arr.length;
        int[] temp = new int[d];
        for(int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        for(int i = d; i < n; i++) {
            arr[i-d] = arr[i];
        }
        int k = 0;
        for(int j = n-d; j < n; j++) {
            arr[j] = temp[k];
            k++;
        }
    }
}
