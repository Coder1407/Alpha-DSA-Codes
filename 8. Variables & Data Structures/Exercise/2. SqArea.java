package Exercise;
import java.util.*;
class SqArea {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side of square");
        double side = sc.nextDouble();
        double area = side * side;
        System.out.println("Area of square = "+area);
        sc.close();
    }
}
