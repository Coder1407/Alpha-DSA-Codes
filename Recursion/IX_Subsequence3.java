// Print any one subsequence whose sum is equal to k

import java.util.*;

public class IX_Subsequence3 {
    public static boolean printF(int idx, ArrayList<Integer> list, int[] arr, int n, int sum, int k) {
        if(idx == n) {
            if(sum == k) {
                // condition satisfied
                System.out.println(list);
                return true;
            }
            // condition not satisfied
            return false;
        }

        // take or pick the particular index into the subsequence
        list.add(arr[idx]);
        sum+= arr[idx];
        if(printF(idx+1, list, arr, n, sum, k) == true) {
            return true;
        }

        // not pick, or not take condition, this element is not added to your subsequence
        list.remove(list.size()-1);
        sum-= arr[idx];
        if(printF(idx+1, list, arr, n, sum, k) == true) {
            return true;
        }

        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,1};
        ArrayList<Integer> list = new ArrayList<>();
        printF(0,list,arr,arr.length, 0, 2);
    }
}
