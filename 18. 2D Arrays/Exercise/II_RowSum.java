package Exercise;
import java.util.*;
public class II_RowSum {
    public static  void readmatrix(int matrix[][]) {
        int n = matrix.length; //gives no. of rows
        int m = matrix[0].length; //gives no. of columns
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter matrix");
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
    }
    public static void showmatrix(int matrix[][]) {
        System.out.println("Matrix is:");
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int secondRowSum(int matrix[][]) {
        int sum=0;
        for(int j=0; j<matrix[0].length; j++) {
            sum += matrix[1][j];
        }
        return sum;
    }
    
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        readmatrix(matrix);
        showmatrix(matrix);
        System.out.println("Second Row Sum = " + secondRowSum(matrix));
    }
}