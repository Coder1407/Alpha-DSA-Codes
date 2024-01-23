import java.util.*;
public class XII_QueueUsingDeque {
    static class Queue {
        Deque<Integer> deque = new LinkedList<>();

        public boolean isEmpty() {
            return deque.isEmpty();
        }

        public void add(int data) {
            deque.addLast(data);
        }
        
        public int remove() {
            if(isEmpty()) {
                System.out.println("Empty Stack");
                return -1;
            }
            int top = deque.getFirst();
            deque.removeFirst();
            return top;
        }

        public int peek() {
            if(isEmpty()) {
                System.out.println("Empty Stack");
                return -1;
            }
            return deque.getFirst();
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        
        while(!q.isEmpty()) {
            System.out.print(q.peek()+" ");
            q.remove();
        }
    }
}
