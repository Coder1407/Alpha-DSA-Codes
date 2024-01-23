import java.util.*;
public class VII_PrintAllSubsequence {
    public static void printF(int idx, ArrayList<Integer> list, int[] arr, int n) {
        if(idx == n) {
            System.out.println(list);
            return;
        }

        // take or pick the particular index into the subsequence
        list.add(arr[idx]);
        printF(idx+1, list, arr, n);

        // not pick, or not take condition, this element is not added to your subsequence
        list.remove(list.size()-1);
        printF(idx+1, list, arr,n);
    }
    public static void main(String[] args) {
        int arr[] = {3,1,2};
        ArrayList<Integer> list = new ArrayList<>();
        printF(0,list,arr,arr.length);
    }
}
