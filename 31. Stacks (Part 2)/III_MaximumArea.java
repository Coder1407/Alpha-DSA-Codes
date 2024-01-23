import java.util.*;
public class III_MaximumArea {
    public static int[] nextSmallerLeft(int arr[]) {
        Stack<Integer> s = new Stack<>();
        int nsl[] = new int[arr.length];

        for(int i=0; i<=arr.length-1; i++) {
            //1. while
            while(!s.isEmpty() && arr[s.peek()]>= arr[i]) {
                s.pop(); 
            }

            //2. if-else
            if(s.isEmpty()) {
                nsl[i] = -1;
            }
            else {
                nsl[i] = s.peek(); // indexes are stored not elements
            }

            //3. push in s
            s.push(i);
        }

        return nsl;
    }

    public static int[] nextSmallerRight(int arr[]) {
        Stack<Integer> s = new Stack<>();
        int nsr[] = new int[arr.length];

        for(int i=arr.length-1; i>=0; i--) {
            //1. while
            while(!s.isEmpty() && arr[s.peek()]>= arr[i]) {
                s.pop(); 
            }

            //2. if-else
            if(s.isEmpty()) {
                nsr[i] = arr.length;
            }
            else {
                nsr[i] = s.peek(); 
            }

            //3. push in s
            s.push(i);
        }

        return nsr;
    } 

    public static int maxArea(int arr[]) {
        int nsl[] = nextSmallerLeft(arr);
        int nsr[] = nextSmallerRight(arr);
        int maxArea = Integer.MIN_VALUE;
        int currArea, height, width;
        for(int i=0; i<arr.length; i++) {
            height = arr[i];
            width = nsr[i] - nsl[i] - 1;
            currArea = height * width;
            maxArea = Math.max(maxArea,currArea);
        }
        return maxArea;
    }
    public static void main(String[] args) {
        int arr[] = {2,1,5,6,2,3}; //heights in histogram
        System.out.println("Maximum area in histogram = "+maxArea(arr));
    }
}
