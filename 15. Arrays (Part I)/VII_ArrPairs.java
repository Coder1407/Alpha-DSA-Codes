import java.util.*;
public class VII_ArrPairs {
    public static void printPairs(int numbers[]) {
        int tp=0;
        for(int i=0; i<numbers.length; i++) {
            int curr = numbers[i];
            for(int j=i+1; j<numbers.length; j++) {
                System.out.print("("+curr+","+numbers[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs= "+tp);
    }
    public static void input(int numbers[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements of array");
        for(int i=0; i<numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of elements: ");
        int n = sc.nextInt();
        int numbers[] = new int[n];
        input(numbers);
        printPairs(numbers);
    }
}