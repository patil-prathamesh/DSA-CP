package Array;

public class MaximumConsecutive1 {
    public static void main(String[] args) {
        System.out.println(optimized(new int[] {1,0,1,1,1,1,1,0,1,1,1,1,1,1,1,0,0}));
    }
    static int bruteforce(int[] arr) {
        int max = 0;
        for(int i = 0; i < arr.length; i++) {
            int count = 0;
            if(arr[i] == 1) {
                for(int j = i; j < arr.length; j++) {
                    if(arr[j] == 1)
                        count++;
                    else
                        break;
                }
            }
            max = Math.max(max,count);
        }
        return max;
    }
    static int optimized(int[] arr) {
        int ans = 0;
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 1)
                count++;
            else
                count = 0;
            ans = Math.max(count,ans);
        }
        return ans;
    }
}
