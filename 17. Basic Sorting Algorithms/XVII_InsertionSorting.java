public class XVII_InsertionSorting {
    public static void insertionSort(int arr[]) {
        int n= arr.length;
        int j,x;
        for(int i=1; i<n; i++) {
            j = i-1;
            x= arr[i];
            while(j > -1 && arr[j] > x ) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = x;
        }
    }
    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,2,3};
        insertionSort(arr);
        printArr(arr);
    }
}
