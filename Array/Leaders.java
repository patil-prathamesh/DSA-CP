package Array;

public class Leaders {
    public static void main(String[] args) {
        leaders(new int[] {30,20,10});
    }
    static void leaders(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int flag = 1;
            for(int j = i+1; j < arr.length; j++) {
                if(arr[j] >= arr[i]) {
                    flag = 0;
                    break;
                }
            }
            if(flag==1) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
