package CodeChef.starters56;

import java.util.Scanner;

public class Main {
}
class A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0) {
            int r1,r2,r3,r4;
            r1 = in.nextInt();
            r2 = in.nextInt();
            r3 = in.nextInt();
            r4 = in.nextInt();
            if(r1==0 && r2==0 && r3==0 && r4==0)
                System.out.println("IN");
            else
                System.out.println("OUT");
        }
    }
}
class B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0) {
            int x = in.nextInt();
            if(x <= 50)
                System.out.println("LEFT");
            else
                System.out.println("RIGHT");
        }
    }
}
class C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0) {
            int n,m;
            n = in.nextInt();
            m = in.nextInt();
            long ans = 0;
            int[] arr = new int[n];
            for(int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
                if(arr[i]<=(m/2)) {
                    ans = ans + Math.abs((m-arr[i]));
                }
                else {
                    ans = ans + Math.abs((arr[i]-1));
                }
            }
            System.out.println(ans);
        }
    }
}
class D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0) {
            int x,y,z;
            x = in.nextInt();
            y = in.nextInt();
            z = in.nextInt();
            int before = 0;
            if(x!=0)
                before++;
            if(y!=0)
                before++;
            if(z!=0)
                before++;
            int newans = 0;
            for(int j = 1; j <= 1; j++) {
                if((x>1)&&(y>1)) {
                    x--;
                    y--;
                    newans++;
                }
                if((y>1)&&(z>1)) {
                    y--;
                    z--;
                    newans++;
                }
                if((x>1)&&(z>1)) {
                    x--;
                    z--;
                    newans++;
                }
            }
            if(x>=1)
                newans++;
            if(y>=1)
                newans++;
            if(z>=1)
                newans++;
            if(before > newans)
                System.out.println(before);
            else
                System.out.println(newans);
        }
    }
}
class E {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0) {

        }
    }
}
class F {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0) {

        }
    }
}
