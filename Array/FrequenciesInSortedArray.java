package Array;

public class FrequenciesInSortedArray {
    public static void main(String[] args) {
        findFrequecy(new int[] {10,20,30});
    }
    static void findFrequecy(int[] arr) {
        int lastUnique = arr[0];
        int count = 1;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] == lastUnique) {
                count++;
            }
            else {
                System.out.println(lastUnique + " " + count);
                lastUnique = arr[i];
                count = 1;
            }
        }
        System.out.println(lastUnique + " " + count);
    }
}
