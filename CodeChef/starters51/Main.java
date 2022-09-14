package CodeChef.starters51;

import java.util.*;

public class Main {
}
class A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 1; i <= t; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            System.out.println((x-y)+z);
        }
    }
}
class B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 1; i <= t; i++) {
            int a,b,c,d;
            a = in.nextInt();
            b = in.nextInt();
            c = in.nextInt();
            d = in.nextInt();
            if((a-c)<(b-d))
                System.out.println("First");
            else if((a-c)>(b-d))
                System.out.println("Second");
            else
                System.out.println("Any");
        }
    }
}
class C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 1; i <= t; i++) {
            HashMap<Integer,Integer> map = new HashMap<>();
            int n = in.nextInt();
            int[] arr = new int[n];
            for(int j = 0; j < n; j++) {
                arr[j] = in.nextInt();
            }
            for(int k = 0; k < n; k++) {
                Integer x = map.get(arr[k]);
                map.put(arr[k],((x == null)?1:x+1));
            }
            int max = Collections.max(map.values());
//            System.out.println("max "+max);
            int maxcount1 = 0;
            for(Integer num : map.values()) {
                if(num == max) {
                    maxcount1++;
//                    System.out.println(maxcount);
                }
//                System.out.print(num + " ");
            }
//            System.out.println();
            if(maxcount1 == 1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
