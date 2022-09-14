package CodeChef.septlong22;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
}
class A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0) {
            int n = in.nextInt();
            int m = in.nextInt();
            int x = in.nextInt();
            System.out.println(((2*n)+(2*m))*x);
        }
    }
}
class B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0) {
            int w = in.nextInt();
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            int total = w+(x*z);
            int atlast = total-(y*z);
            System.out.println(atlast);
        }
    }
}
class C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0) {
            float a = in.nextFloat();
            float x = in.nextFloat();
            float b = in.nextFloat();
            float y = in.nextFloat();
            if((a/x)>(b/y))
                System.out.println("Alice");
            else if((a/x)<(b/y))
                System.out.println("Bob");
            else
                System.out.println("Equal");
        }
    }
}
class D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0) {
            int n = in.nextInt();
            int[] arr = new int[n];
            HashMap<Long,Long> map = new HashMap<>();
            for(int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
                Long x = map.get((long)arr[i]);
                map.put((long)arr[i],(x==null)?1:x+1);
            }
            long ans = 0;
            for(Long val : map.values()) {
                ans = ans + ((val*(val-1))/2);
            }
            System.out.println(ans);
        }
    }
}
class E {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0) {
            int n = in.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i< n; i++) {
                arr[i] = in.nextInt();
            }
            int min = arr[0];
            int max = arr[0];
            for(int i = 1; i < n; i++) {
                if(arr[i] >= max)
                    max = arr[i];
                else if(arr[i] < min)
                    min = arr[i];
            }
            if((min>=0) && (max>=0))
                System.out.println((long)(min*min) + " " + (long)(max*max));
            else if((max<=0) && (min <=0))
                System.out.println((long)(max*max) + " " + (long)(min*min));
            else {
                System.out.println((long)(min*min)>(long)(max*max)?(long)(min*min):(long)(max*max));
                System.out.println((long)(min*max));
            }
        }
    }
}