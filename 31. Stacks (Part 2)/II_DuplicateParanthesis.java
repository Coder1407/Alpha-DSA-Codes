import java.util.*;
public class II_DuplicateParanthesis {
    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            // closing
            if(ch==')') {
                int count = 0;
                while(s.peek()!='(') {
                    // !s.isEmpty() not included becuse in question string is always valid
                    s.pop();
                    count++;
                }
                if(count < 1) {
                    return true; // duplicate exists
                }
                s.pop(); // opening pair
            }
            else {
                // opening
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "((a+b))"; // true
        String str2 = "(a-b)"; // false
        System.out.println(isDuplicate(str));
        System.out.println(isDuplicate(str2));
    }
}
