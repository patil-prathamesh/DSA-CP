package CodeChef;

import java.util.*;

public class Starters54 {
}
class Div4A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int x,y,z;
            x = sc.nextInt();
            y = sc.nextInt();
            z = sc.nextInt();
            System.out.println(4*x + 2*y);
        }
    }
}
class Div4B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n;
            n = sc.nextInt();
            HashMap<Integer,Integer>map = new HashMap<>();
            for(int i = 1; i <= n; i++) {
                int x = sc.nextInt();
                Integer val = map.get(x);
                map.put(x,(val==null) ? 1 : val+1);
            }
            int maxValue = Collections.max(map.values());
            if(n%2==1 && maxValue==1)
                System.out.println("NO");
            else
                System.out.println("Yes");
        }
    }
}
class Div4C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
        }
    }
}
class One {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while(t-- > 0) {
            int x,p,q;
            x = sc.nextInt();
            p = sc.nextInt();
            q = sc.nextInt();
            System.out.println(x*(p-q));
        }
    }
}
