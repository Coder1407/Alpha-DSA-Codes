import java.util.*;
public class VI_largestof3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        System.out.println("Largest is:");
        if(A>=B && B>=C) {
            System.out.println(A);
        }
        else if(B>=C) {
            System.out.println(B);
        }
        else {
            System.out.println(C);
        }
    }
}
