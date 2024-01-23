public class VI_AddMiddle {
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
    
    public void addMiddle(int idx, int data) {
        if(idx==0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i=0;
        
        while(i< idx-1) {
            temp = temp.next;
            i++;
        }
        // i = idx-1; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
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
        VI_AddMiddle ll = new VI_AddMiddle();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();

        ll.addMiddle(2, 9);
        ll.print();
    }
}
