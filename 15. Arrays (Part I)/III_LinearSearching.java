import java.util.*;
public class III_LinearSearching {
    public static int LinearSearch(int numbers[], int key) {
        for(int i=0; i<=numbers.length; i++) {
            if(numbers[i]==key) {
                return i;
            }
        }
        return -1;
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
        System.out.println("Enter element to be searched");
        int key = sc.nextInt();
        int index = LinearSearch(numbers, key);
        if(index == -1) {
            System.out.println("Element not found");
        }
        else {
            System.out.println("Element found at index: "+index);
        }
    }
}