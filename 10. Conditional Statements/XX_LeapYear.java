import java.util.*;
public class XX_LeapYear {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year");
        int year = sc. nextInt();
        boolean x, y, z;
        x = (year % 4) == 0;
        y = (year % 100) != 0;
        z = ((year % 100) == 0) && ((year % 400) == 0);
        if(x && (y || z)) {
            System.out.println("Leap Year");
        }
        else {
            System.out.println("Not a leap year");
        }
    }
}
