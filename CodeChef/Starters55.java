package CodeChef;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Starters55 {
}
class E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int x,y;
            x = sc.nextInt();
            y = sc.nextInt();
            System.out.println(y + " " + y + " " + (3*x-2*y));
        }
    }
}
class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            if((k*(k+1))/2 <= n)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int[] nn = new int[n];
            for(int i = 0; i < n; i++) {
                nn[i] = sc.nextInt();
            }
            int k = sc.nextInt();
            HashSet<Integer> set = new HashSet<>();
            for(int i = 1; i <= k; i++) {
                int x = sc.nextInt();
                set.add(x);
            }
            for(int i = 0; i < n; i++) {
                if(!set.contains(nn[i])) {
                    System.out.print(nn[i] + " ");
                }
            }
            System.out.println();
        }
    }
}
class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int x = sc.nextInt();
            if(x > 98)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int x,y;
            x = sc.nextInt();
            y = sc.nextInt();
            if(x==y)
                System.out.println("ANY");
            else if(x < y)
                System.out.println("REPAIR");
            else
                System.out.println("NEW PHONE");
        }
    }
}
