public class V_PalindromeString {
    public static boolean pal(String str, int i) {
        if(i>=str.length()/2) {
            return true;
        }
        if(str.charAt(i) != str.charAt(str.length()-i-1)) {
            return false;
        }
        return pal(str, i+1);
    }
    public static void main(String[] args) {
        String str = "MADAM";
        System.out.println(pal(str, 0));
    }
}
