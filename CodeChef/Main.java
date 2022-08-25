package CodeChef;
import java.util.Scanner;
public class Main {
}

class Cc4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while(t-- > 0) {
            int a,b,c;
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            if(b >= (a>c ? a : c)) {
                System.out.println("yes");
            }
            else {
                System.out.println("no");
            }
        }
        sc.close();
    }
}
class Cc3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t;
        t = in.nextInt();
        while(t-- > 0) {
            int x;
            x = in.nextInt();
            if(x > 100 && x <= 1000) {
                x -= 25;
            }
            else if(x > 1000 && x <= 5000) {
                x -= 100;
            }
            else if(x > 5000) {
                x -= 500;
            }
            System.out.println(x);
        }
        in.close();
    }
}

class Cc2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c;
        c = sc.nextInt();
        if(c <= 1000) {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
        sc.close();

    }
}

class Cc1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t-- > 0) {
            int x;
            x = sc.nextInt();
            int totalSec = x * 60;
            System.out.println((totalSec / 30));
        }
        sc.close();
    }
}
