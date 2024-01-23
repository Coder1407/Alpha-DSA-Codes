public class IV_AddLast {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void addLast(int data) {
        // step 1 - create new node
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
            return;
        }
        
        // step 2 - tail next = newnode
        tail.next = newNode; //link

        // step 3- tail = newNode 
        tail = newNode;
    }
    public static Node head;
    public static Node tail;
    public static void main(String[] args) {
        IV_AddLast ll = new IV_AddLast();
        ll.addLast(3);
        ll.addLast(4);
    }
}
