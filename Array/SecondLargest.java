package Array;
import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(secondLargest(arr));
        sc.close();
    }
    static int secondLargest(int[] arr) {
        int largest = 0;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > arr[largest]) {
                largest = i;
            }
        }
        int slargest = -1; 
        int sindex = -1;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < arr[largest] && arr[i]>slargest) {
                slargest = arr[i];
                sindex = i;
            }
        }
        return sindex;
    }
}
