public class IV_ReverseArray {
    public static void reverse(int arr[], int l, int r) {
        if(l>=r) {
            return;
        }
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        reverse(arr, l+1, r-1);
    }

    public static void reverse2(int arr[], int i) {
        if(i>=arr.length/2) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[arr.length-i-1];
        arr[arr.length-i-1] = temp;
        reverse2(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        // reverse(arr, 0, arr.length-1);
        reverse2(arr, 0);
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
