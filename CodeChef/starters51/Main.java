package CodeChef.starters51;

import java.util.Scanner;

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
