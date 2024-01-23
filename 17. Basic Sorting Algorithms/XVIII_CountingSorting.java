public class XVIII_CountingSorting {
    public static void countingSort(int arr[]) {
        //Finding maximum element of array
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest+1];
        //putting values in count array
        for(int i=0; i<arr.length; i++) {
            count[arr[i]]++;
        }

        //sorting
        int j=0;
        for(int i=0; i<count.length; i++) {
            while(count[i]>0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
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
        countingSort(arr);
        printArr(arr);
    }
}