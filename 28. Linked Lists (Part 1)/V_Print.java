public class V_Print {
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

    public void addFirst(int data) {
        // step 1 - create new node
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
            return;
        }

        // step 2 - newNode next = head
        newNode.next = head; //link

        // step 3- head = newNode
        head = newNode;
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

    public void print() {
        if(head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while(temp!=null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        V_Print ll = new V_Print();
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();
    }
}
