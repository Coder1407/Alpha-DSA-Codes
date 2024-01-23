package Exercise;
/*
An anagram is a word or phrase formed by rearranging the letters of a different word or phrase. 
We can generalize this in string processing by saying that an anagram of a string is another string with exactly the same quantity of each character in it, in any order. 
*/
import java.util.*;
public class IV_Anagrams {
    public static boolean isAnagram(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if(str1.length() == str2.length()) {
            char[] str1charArray = str1.toCharArray();
            char[] str2charArray = str2.toCharArray();
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);
            boolean result = Arrays.equals(str1charArray, str2charArray);
            return result;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        if(isAnagram(str1, str2)) {
            System.out.println(str1+" "+str2+" are anagrams of each other");
        }
        else {
            System.out.println(str1+" "+str2+" are not anagrams of each other");
        }
    }
}
