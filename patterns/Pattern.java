package patterns;

public class Pattern {
}
class P17 {
    public static void main(String[] args) {
        
    }
}
class P16 {
    public static void main(String[] args) {
        for(int i = 0; i <= 4; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print((char)(65+i));
            }
            System.out.println();
        }
    }
}
class P15 {
    public static void main(String[] args) {
        for(int i = 4; i >= 0; i--) {
            for(int j = 0; j <= i; j++) {
                System.out.print((char)(65+j));
            }
            System.out.println();
        }
    }
}
class P14 {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print(((char)(65+j)));
            }
            System.out.println();
        }
    }
}
class P13 {
    public static void main(String[] args) {
        int digit = 1;
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(digit + " ");
                digit++;
            }
            System.out.println();
        }
    }
}
class P12 {
    public static void main(String[] args) {
        for(int i = 1; i <= 4; i++) {
            for(int p = 1; p <= i; p++) {
                System.out.print(p);
            }
            for(int s = 1; s <= 8-(i*2); s++) {
                System.out.print(" ");
            }
            for(int p = i; p >= 1; p--) {
                System.out.print(p);
            }
            System.out.println();
        }
    }
}
class P11 {
    public static void main(String[] args) {
        for(int i = 1; i <= 6; i++) {
            if(isEven(i)) {
                for(int p = 1; p <= i; p++) {
                    if(isEven(p)) {
                        System.out.print(1);
                    }
                    else {
                        System.out.print(0);
                    }
                }
            }
            else {
                for(int p = 1; p <= i; p++) {
                    if(isEven(p)) {
                        System.out.print(0);
                    }
                    else {
                        System.out.print(1);
                    }
                }
            }
            System.out.println();
        }
    }
    static boolean isEven(int num) {
        if(num % 2 == 0) 
            return true;
        else 
            return false;
    }
}
class P10 {
    public static void main(String[] args) {
        for(int i = 1; i <= 9; i++) {
            if(i<=5) {
                for(int p = 1; p <= i; p++) {
                    System.out.print("*");
                }
            }
            else {
                for(int p = 1; p <= (10-i); p++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
class P9 {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {
            for(int s = 1; s <= (5-i); s++) {
                System.out.print(" ");
            }
            for(int p = 1; p <= (i*2)-1; p++) {
                System.out.print("*");
            }
            for(int s = 1; s <= (5-i); s++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i = 1; i <= 5; i++) {
            for(int s = 1; s < i; s++) {
                System.out.print(" ");
            }
            for(int j = i; j <= (9-i)+1; j++) {
                System.out.print("*");
            }
            for(int s = (10-i)+1; s <= 9; s++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
class P8 {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {
            for(int s = 1; s < i; s++) {
                System.out.print(" ");
            }
            for(int j = i; j <= (9-i)+1; j++) {
                System.out.print("*");
            }
            for(int s = (10-i)+1; s <= 9; s++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
class P7 {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {
            for(int s = 1; s <= (5-i); s++) {
                System.out.print(" ");
            }
            for(int p = 1; p <= (i*2)-1; p++) {
                System.out.print("*");
            }
            for(int s = 1; s <= (5-i); s++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

class P6 {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= (6-i); j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

class P5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= (6 - i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class P4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

class P3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

class P2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class P1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
