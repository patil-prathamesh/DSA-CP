package CodeChef.julylongtwo22;

import java.util.Scanner;

public class Main {
}
class B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0) {
            int x = in.nextInt();
            int y = in.nextInt();
            System.out.println((x*4)+y);
        }
    }
}
class A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0) {
            int x = in.nextInt();
            int y = in.nextInt();
            if(y<=x)
                System.out.println(y);
            else
                System.out.println(x);
        }
    }
}
