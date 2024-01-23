import java.util.*;
public class IV_Largest_Smallest {
    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static int getSmallest(int numbers[]){
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        return smallest;
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
        System.out.println("Largest value is: "+getLargest(numbers));
        System.out.println("Smallest value is: "+getSmallest(numbers));
    }
}