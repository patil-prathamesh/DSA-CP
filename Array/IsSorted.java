package Array;
public class IsSorted {
    public static void main(String[] args) {
        System.out.println(isSorted(new int[] {100,20,200})); 
    }
    static boolean isSorted(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < arr[i-1]) 
                return false;
        }
        return true;
    }
}
