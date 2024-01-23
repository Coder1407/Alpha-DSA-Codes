import java.util.*;
public class V_Binomial {
    public static int fact(int n) {
        int f=1;
        for(int i=1; i<=n; i++) {
            f = f * i;
        }
        return f;
    }
    public static int binCoeff(int n, int r) {
        int fact_n = fact(n);
        int fact_r = fact(r);
        int fact_nmr = fact(n-r);
        int binc = fact_n/ (fact_r * fact_nmr);
        return binc;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n and r");
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println("Binomial Coefficient = "+binCoeff(n,r));
    }
}
