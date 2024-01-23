public class II_sum {
    public static void f(int i, int sum) {
        if(i<1) {
            System.out.println(sum);
            return;
        }
        f(i-1, sum+i);
    }

    public static void f2(int i, int n, int sum) {
        if(i>n) {
            System.out.println(sum);
            return;
        }
        f2(i+1, n, sum+i);
    }

    public static int f3(int n) {
        if(n==0) {
            return 0;
        }
        return n + f3(n-1);
    }
    public static void main(String[] args) {
        // f(5,0);
        // f2(1, 5, 0);
        System.out.println(f3(5));
    }
}
