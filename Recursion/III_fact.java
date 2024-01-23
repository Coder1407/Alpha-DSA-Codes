public class III_fact {
    public static int f(int n) {
        if(n==1) {
            return 1;
        }
        return n * f(n-1);
    }
    public static void main(String[] args) {
        // f(5,0);
        // f2(1, 5, 0);
        System.out.println(f(5));
    }
}
