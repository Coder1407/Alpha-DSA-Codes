import java.util.*;
public class X_Deque {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();

        deque.addFirst(4);
        deque.addFirst(3);
        deque.addFirst(2);
        deque.addFirst(1);
        System.out.println(deque);

        deque.addLast(5);
        deque.addLast(6);
        System.out.println(deque);

        deque.removeFirst();
        System.out.println(deque);

        deque.removeLast();
        System.out.println(deque);

        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());
    }
}
