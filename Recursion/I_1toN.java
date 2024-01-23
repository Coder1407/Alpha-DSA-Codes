
public class I_1toN {
    public static void f1(int i, int n) {
        if(i>n) {
            return;
        }
        System.out.println(i);
        f1(i+1,n);
    }

    public static void f2(int i, int n) {
        if(i<1) {
            return;
        }
        System.out.println(i);
        f2(i-1, n);
    }

    public static void f3(int i, int n) {
        if(i<1) {
            return;
        }
        f3(i-1,n);
        System.out.println(i);
    }

    public static void f4(int i, int n) {
        if(i>n) {
            return;
        }
        f4(i+1,n);
        System.out.println(i);
    }
    public static void main(String[] args) {
        // f1(1,5);  // 1 to N using recursion 
        // f2(5,5);  // N to 1 using recursion
        // f3(5,5); // 1 to N using backtracking 
        f4(1,5); // N to 1 using backtracking
    }
}