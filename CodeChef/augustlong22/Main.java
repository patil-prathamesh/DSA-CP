package CodeChef.augustlong22;

import java.util.Scanner;

public class Main {
}
class E {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0) {

        }
    }
}
class D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0) {
            int n = in.nextInt();
            int[] arr = new int[n-1];
            for(int i = 0; i < n-1; i++) {
                arr[i] = in.nextInt();
            }
        }
    }
}
class C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0) {
            int a,b;
            a = in.nextInt();
            b = in.nextInt();
            int min = a<b?a:b;
            int max = a>b?a:b;
            if(a==b) {
                System.out.println("YES");
            }
            else {
                int flag = 0;
                while(min <= max) {
                    if(min==max) {
                        flag = 1;
                        System.out.println("YES");
                        break;
                    }
                    min *=2;
                }
                if(flag ==0)
                    System.out.println("NO");
            }
        }
    }
}
