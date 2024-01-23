import java.util.*;
public class IV_sum_one_to_n {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Range");
        int range = sc.nextInt();
        int sum = 0;
        int counter = 1;
        while(counter <= range) {
            sum = sum + counter;
            counter++;
        }
        System.out.println(sum);
        sc.close();
    }
}