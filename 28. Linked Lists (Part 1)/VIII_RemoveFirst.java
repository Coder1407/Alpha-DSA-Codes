public class VIII_RemoveFirst {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public int removeFirst() {
        if(size == 0) {
            System.out.println("Linked List is empty");
            return Integer.MAX_VALUE;
        }
        else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        size--;
        int val = head.data;
        head = head.next;
        return val;
    }
    
    public static void main(String[] args) {
        VIII_RemoveFirst ll = new VIII_RemoveFirst();

        ll.removeFirst();
    }
}
