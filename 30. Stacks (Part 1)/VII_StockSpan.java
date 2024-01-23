import java.util.*;
public class VII_StockSpan {

    public static void stockSpan(int stocks[], int span[]) {
        Stack<Integer> s = new Stack<>();
        span[0] = 1; //span for 1st day is always one
        s.push(0);

        for(int i=1; i<stocks.length; i++) {
            int currPrice = stocks[i];
            while(!s.isEmpty() && currPrice > stocks[s.peek()]) {
                //keep removing elements smaller than current element
                s.pop();
            }
            if(s.isEmpty()) {
                // if all elements are smaller than current element and stack becomes empty
                span[i] = i+1; // like for 100 in last idx
            }
            else {
                int prevHigh = s.peek();
                span[i] = i - prevHigh;
            }
            s.push(i);
        }
    }
    public static void main(String[] args) {
        int stocks[] = {100,80,60,70,60,85,100};
        int span[] = new int[stocks.length];
        stockSpan(stocks,span);

        for(int i=0; i<span.length; i++) {
            System.out.println(span[i]+" ");
        }
    }
}
