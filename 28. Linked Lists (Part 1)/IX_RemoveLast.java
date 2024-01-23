public class IX_RemoveLast {
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

    public int removeLast() {
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
        Node prev = head;
        for(int i=0; i<size-2; i++) {
            prev = prev.next;
        }

        int val = prev.next.data; //tail.data
        prev.next= null;
        tail = prev;
        size--;
        return val;
    }

    public static void main(String[] args) {
        IX_RemoveLast ll = new IX_RemoveLast();

        ll.removeLast();
        
    }
}
