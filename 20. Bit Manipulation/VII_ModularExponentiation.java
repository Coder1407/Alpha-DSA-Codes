import java.util.*;
public class VII_ModularExponentiation {
    public static int modExpo(int a, int n, int p) {
        int ans = 1;
        while (n > 0) {
            if((n & 1)!=0) { //Check LSB
                ans = ans * a;
            }
            a = a*a;
            n = n >> 1;
        }
        return ans%p;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base and power");
        int a = sc.nextInt();
        int n = sc.nextInt();
        System.out.println("Enter modulo");
        int p = sc.nextInt();
        System.out.println("The answer is " + modExpo(a, n, p));
    }
}
