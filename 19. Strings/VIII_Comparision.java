import java.util.*;
public class VIII_Comparision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1= "Tony";
        String s2= "Tony";
        String s3 = new String("Tony");
        System.out.println("Enter 1 for == and 2 for equals()");
        int ch = sc.nextInt();
        switch(ch) {
            case 1:
            if(s1==s2) {
                System.out.println("s1 and s2 are equal");
            }
            else {
                System.out.println("s1 and s2 are not equal");
            }
            if(s2==s3) {
                System.out.println("s2 and s3 are equal");
            }
            else {
                System.out.println("s2 and s3 are not equal");
            }
            break;
            case 2:
            if(s1.equals(s2)) {
                System.out.println("s1 and s2 are equal");
            }
            else {
                System.out.println("s1 and s2 are not equal");
            }
            if(s2.equals(s3)) {
                System.out.println("s2 and s3 are equal");
            }
            else {
                System.out.println("s2 and s3 are not equal");
            }
            break;
        }
    }
}
