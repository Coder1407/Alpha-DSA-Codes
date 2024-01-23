public class XIII_RemoveNth {
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

    public void deleteNthfromEnd(int n) {
        // calculate size
        int sz = 0;
        Node temp = head;
        while(temp!=null) {
            temp = temp.next;
            sz++;
        }

        if(n==sz) {
            // deleting head (removeFirst)
            head = head.next;
            return;
        }

        // sz-n
        int i = 1;
        int iToFind = sz-n;
        Node prev = head;
        while(i < iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    public static void main(String[] args) {
        XIII_RemoveNth ll = new XIII_RemoveNth();
        ll.deleteNthfromEnd(3);
    }
}
