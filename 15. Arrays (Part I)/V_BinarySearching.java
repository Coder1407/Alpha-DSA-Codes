import java.util.*;
public class V_BinarySearching {
    public static int binarySearch(int numbers[], int key) {
        int start=0, end=numbers.length-1;;
        while(start<=end) {
            int mid = (start+end)/2;
            if(numbers[mid]==key){ //found
                return mid;
            }
            if(numbers[mid]<key) { //right
                start = mid+1;
            }
            else { //left
                end = mid-1;
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
        int index = binarySearch(numbers, key);
        if(index == -1) {
            System.out.println("Element not found");
        }
        else {
            System.out.println("Element found at index: "+index);
        }
    }
}