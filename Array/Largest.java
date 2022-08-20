package Array;

public class Largest {
    public static void main(String[] args) {
        System.out.println(largestEle(new int[] {40,8,50,100}));
    }
    static int largestEle(int[] arr) {
        int largest = arr[0];
        int index = -1;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > largest) {
                index = i;
                largest = arr[i];
            }
        }
        return index;
    }
}
