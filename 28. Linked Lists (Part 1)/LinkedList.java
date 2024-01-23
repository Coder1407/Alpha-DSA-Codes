public class LinkedList {
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

    public void addFirst(int data) {
        size++;
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
        size++;
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

    public void addMiddle(int idx, int data) {
        if(idx==0) {
            addFirst(data);
            return;
        }
        size++;
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
        System.out.print("After removing last node: ");
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
    public int itrSearch(int key) {
        Node temp = head;
        int i = 0;

        while(temp!= null) {
            if(temp.data == key) { // key found
                return i;
            }
            temp = temp.next;
            i++;
        }
        //key not found
        return -1;
    }

    public int helper(Node head, int key) {
        if(head == null) {
            return -1;
        }
        if(head.data==key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1) {
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key) {
        return helper(head, key);
    }

    public void reverse() {
        Node prev = null;
        Node curr = tail= head;
        Node next;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

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
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.addMiddle(2, 9);
        System.out.print("Linked List: ");
        ll.print();

        ll.removeLast();
        ll.print();

        System.out.println("(iterative search)Key index = "+ ll.itrSearch(3));
        System.out.println("(iterative search)Key index = "+ll.itrSearch(10));

        System.out.println("(recursive search)Key index = "+ll.recSearch(3));
        System.out.println("(recursive search)Key index = "+ll.recSearch(10));

        System.out.print("Reverse of linked list: ");
        ll.reverse();
        ll.print();

        System.out.println("After Deleting nth node from end: ");
        ll.deleteNthfromEnd(3);
        ll.print();
    }
}
