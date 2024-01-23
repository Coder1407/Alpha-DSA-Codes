package Exercise;
import java.util.*;
public class I_Average_three {
    public static double average(int a, int b, int c) {
        double avg = (a+b+c)/3.0;
        return avg;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Average = "+average(a, b, c));
    }
}
