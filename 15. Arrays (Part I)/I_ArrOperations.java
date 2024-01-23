import java.util.*;
public class I_ArrOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Array Creation
        int marks[] = new int[5];

        //Array Input
        System.out.println("Enter marks of Students:");
        for(int i=0; i<5; i++) {
            marks[i] = sc.nextInt();
        }
        
        //Array Output:
        System.out.println("\nStudents Marks:");
        for(int i=0; i<5; i++) {
            System.out.println(marks[i]);
        }

        //Array Update:
        marks[3] = 84;
        System.out.println("\nUpdated marks: ");
        for(int i=0; i<5; i++) {
            System.out.println(marks[i]);
    }
}
}
