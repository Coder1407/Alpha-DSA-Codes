// Count no. of sequences with sum = k

public class IV_Subsequence4 {
    public static int printF(int idx, int[] arr, int n, int sum, int k) {
        if(sum>k) {
            // condition not satisfied
            // strictly done if array contains positives only
            return 0;
        }
        if(idx == n) {
            if(sum == k) {
                // condition satisfied
                return 1;
            }
            // condition not satisfied
            return 0;
        }

        // take or pick the particular index into the subsequence
        sum+= arr[idx];
        int l = printF(idx+1, arr, n, sum, k);

        // not pick, or not take condition, this element is not added to your subsequence
        sum-= arr[idx];
        int r = printF(idx+1, arr, n, sum, k);

        return l+r;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,1};
        System.out.println(printF(0,arr,arr.length, 0, 2));
    }
}
