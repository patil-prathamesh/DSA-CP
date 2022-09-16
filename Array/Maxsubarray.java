package Array;

public class Maxsubarray {
    public static void main(String[] args) {
        System.out.println(optimized(new int[] {-5,1,-2,3,-1,2,-2}));
    }
    static int bruteforce(int[] arr) {
        int ans = arr[0];
        for(int i = 0; i < arr.length; i++) {
            int sum = 0;
            for(int j = i; j < arr.length; j++) {
                sum += arr[j];
                if(sum > ans)
                    ans = sum;
            }
        }
        return ans;
    }
    static int optimized(int[] arr) {
        int maxEnding = arr[0];
        int ans = arr[0];
        for(int i = 1; i < arr.length; i++) {
            maxEnding = Math.max((maxEnding+arr[i]),arr[i]);
            ans = Math.max(ans,maxEnding);
        }
        return ans;
    }
}
