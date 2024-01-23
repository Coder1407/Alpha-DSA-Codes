import java.util.*;
public class VIII_NextGreater {
    public static void main(String[] args) {
        int arr[] = {5,7,1,2,6,0};
        Stack<Integer> s = new Stack<>();
        int nxtGreater[] = new int[arr.length];

        for(int i=arr.length-1; i>=0; i--) {
            //1. while
            while(!s.isEmpty() && arr[s.peek()]<= arr[i]) {
                s.pop(); // store indexes in stack, not elements
            }

            //2. if-else
            if(s.isEmpty()) {
                nxtGreater[i] = -1;
            }
            else {
                nxtGreater[i] = arr[s.peek()]; 
                // store top element of stack in nxtGreater
            }

            //3. push in s
            s.push(i);
        }

        for(int i=0; i<nxtGreater.length; i++) {
            System.out.print(nxtGreater[i] + " ");
        }
        System.out.println();
    }
}
