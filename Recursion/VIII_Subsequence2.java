// Print all subsequences with sum equal to k

import java.util.*;

public class VIII_Subsequence2 {
    public static void printF(int idx, ArrayList<Integer> list, int[] arr, int n, int sum, int k) {
        if(idx == n) {
            if(sum == k) {
                System.out.println(list);
            }
            return;
        }

        // take or pick the particular index into the subsequence
        list.add(arr[idx]);
        sum+= arr[idx];
        printF(idx+1, list, arr, n, sum, k);

        // not pick, or not take condition, this element is not added to your subsequence
        list.remove(list.size()-1);
        sum-= arr[idx];
        printF(idx+1, list, arr, n, sum, k);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,1};
        ArrayList<Integer> list = new ArrayList<>();
        printF(0,list,arr,arr.length, 0, 2);
    }
}
