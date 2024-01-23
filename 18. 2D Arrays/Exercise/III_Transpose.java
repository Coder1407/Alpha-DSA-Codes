package Exercise;
import java.util.*;
public class III_Transpose {
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
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] transposeMatrix(int matrix[][]) {
        int transpose[][] = new int[3][3];
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        readmatrix(matrix);
        System.out.println("Original Matrix: ");
        showmatrix(matrix);
        int transpose[][] = transposeMatrix(matrix);
        System.out.println("Transpose Matrix");
        showmatrix(transpose);
    }
}