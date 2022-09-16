package Array;

public class TrappingRainWater {
    public static void main(String[] args) {
        System.out.println(optimized(new int[] {0,1,0,2,1,0,1,3,2,1,2,1}));
    }
    static int totalWater(int[] height) {
        int ans = 0;
        for(int i = 1; i < height.length-1; i++) {
            int lmax = height[i];
            for(int l = 0; l < i; l++) {
                lmax = Math.max(lmax,height[l]);
            }
            int rmax = height[i];
            for(int r = i+1; r < height.length; r++) {
                rmax = Math.max(rmax,height[r]);
            }
            ans = ans + (Math.min(lmax,rmax))-height[i];
        }
        return ans;
    }
    static int optimized(int[] height) {
        int ans = 0;
        int[] lmax = new int[height.length];
        lmax[0] = height[0];
        for(int i = 1; i < height.length; i++) {
            lmax[i] = Math.max(lmax[i-1],height[i]);
        }
        int[] rmax = new int[height.length];
        rmax[height.length-1] = height[height.length-1];
        for(int j = height.length-2; j >= 0; j--) {
            rmax[j] = Math.max(rmax[j+1],height[j]);
        }
        for(int i = 1; i < height.length-2; i++) {
            ans = ans + ((Math.min(lmax[i],rmax[i])) - height[i]);
        }
        return ans;
    }
}
