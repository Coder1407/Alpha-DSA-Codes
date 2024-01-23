import java.util.*;
public class VI_Palindrome {
    public static boolean isPalindrome(String str) {
        int n =str.length();
        for(int i=0; i<str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(n-i-1)) {
                //not a palindrome
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String str = sc.nextLine();
        System.out.println(isPalindrome(str));
    }
}
