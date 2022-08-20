package Array;
import java.util.*;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(remDuplicate(arr));
        sc.close();
    }
    static int remDuplicate(int[] arr) {
        int res = 1;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[res-1]) {
                arr[res] = arr[i];
                res++;
            }
        }
        return res;
    }
}
