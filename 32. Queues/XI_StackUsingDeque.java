import java.util.*;
public class XI_StackUsingDeque {
    static class Stack {
        Deque<Integer> deque = new LinkedList<>();

        public boolean isEmpty() {
            return deque.isEmpty();
        }

        public void push(int data) {
            deque.addLast(data);
        }
        
        public int pop() {
            if(isEmpty()) {
                System.out.println("Empty Stack");
                return -1;
            }
            int top = deque.getLast();
            deque.removeLast();
            return top;
        }

        public int peek() {
            if(isEmpty()) {
                System.out.println("Empty Stack");
                return -1;
            }
            return deque.getLast();
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        
        while(!s.isEmpty()) {
            System.out.println(s.peek()+" ");
            s.pop();
        }
    }
}
