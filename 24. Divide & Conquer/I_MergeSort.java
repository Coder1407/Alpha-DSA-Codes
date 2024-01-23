public class I_MergeSort {
    public static void mergeSort(int arr[], int si, int ei) {
        //Base Case
        if(si>=ei) {
            return;
        }

        //Kaam
        int mid = si + (ei-si)/2; // or = (si+ei)/2
        mergeSort(arr, si, mid); // left part
        mergeSort(arr, mid+1, ei); // right part
        merge(arr, si, mid, ei);
    }
    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei-si+1];  // due to 0 based indexing an extra index required so +1
        int i = si; //idx for 1st sorted part
        int j = mid + 1; //idx for 2nd sorted part
        int k = 0; //idx for temp
        while(i<=mid && j<=ei) {
            if(arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            }
            else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        //for leftover elements of 1st sorted part
        while(i<=mid) {
            temp[k++] = arr[i++];
        }

        //for leftover elements of 2nd sorted part
        while(j<=ei) {
            temp[k++] = arr[j++];
        }

        //copy temp to original array
        for(k=0, i=si; k<temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }
    public static void printArr(int arr[]) {
        System.out.println("Sorted array: ");
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        mergeSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}