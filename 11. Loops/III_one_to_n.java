import java.util.*;
public class III_one_to_n {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Range");
        int range = sc.nextInt();
        int counter = 1;
        while(counter <= range) {
            System.out.println(counter);
            counter++;
        }
        sc.close();
    }
}
