import java.util.*;
public class VI_ArrReverse {
    public static void reverse(int numbers[]) {
        int first=0, last = numbers.length-1;
        while(first<last) {
            //swapping
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
    }
    public static void input(int numbers[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements of array");
        for(int i=0; i<numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
    }
    public static void output(int numbers[]) {
        for(int i=0; i<5; i++) {
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of elements: ");
        int n = sc.nextInt();
        int numbers[] = new int[n];
        input(numbers);
        reverse(numbers);
        System.out.println("Reversed array:");
        output(numbers);
    }
}