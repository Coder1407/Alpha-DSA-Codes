import java.util.*;
public class I_MatrixCreation {
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
    public static  void showmatrix(int matrix[][]) {
        System.out.println("Matrix is:");
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static boolean search(int matrix[][], int key) {
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                if(matrix[i][j] == key) {
                    System.out.println("found at cell ("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        readmatrix(matrix);
        showmatrix(matrix);
        search(matrix, 5);
    }
}