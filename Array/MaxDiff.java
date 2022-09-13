package Array;

public class MaxDiff {
    public static void main(String[] args) {
        int[] arr = {30,10,8,2};
        System.out.println(maxDiff(arr));
    }
    static int maxDiff(int[] arr) {
        int ans = arr[1]-arr[0];
        for(int i = 0; i <= arr.length-2; i++) {
            for(int j = i+1; j < arr.length; j++) {
                if(arr[j]-arr[i] > ans)
                    ans = arr[j]-arr[i];
            }
        }
        return ans;
    }
}
