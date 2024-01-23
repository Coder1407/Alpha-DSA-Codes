import java.util.*;
class TypeConversion {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = 4;

        long b = a; //type compatible
        System.out.println(b);

        //boolean c = a; //type incompatible

        long c = a; //destination type > source type
        System.out.println(c);

        //byte d = a; //destination type < source type -> error

        System.out.println("Enter number");
        //int number = sc.nextFloat(); // larger storing in smaller ->error
        float number = sc.nextFloat();
        System.out.println(number);

        //Type Conversion of characters to int
        char ch = 'a';
        int num = ch;
        System.out.println(num);
    }
}
