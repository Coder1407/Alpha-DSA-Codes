package Exercise;
import java.util.*;
class Bill {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter cost of pencil ");
        float pencil = sc.nextFloat();
        System.out.print("Enter cost of pen ");
        float pen = sc.nextFloat();
        System.out.print("Enter cost of eraser ");
        float eraser = sc.nextFloat();

        float bill = pencil + pen + eraser;
        System.out.println("Bill = "+bill);

        float totalbill = bill + (0.18f * bill);
        System.out.print("Bill after 18% tax = "+totalbill);
        sc.close();
    }
}
