public class XIV_Palindrome {
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

    // slow fast pointer
    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next; //+1
            fast = fast.next.next; //+2
        }
        return slow; // slow is my midNode
    }

    public boolean checkPalindrome() {
        if(head == null || head.next == null) {
            return true;
        }
        // step 1 - find mid
        Node midNode = findMid(head);

        // step 2 - reverse second half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr!=null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right= prev; // right half head
        Node left = head; // left half head

        //step 3 - check left half and right half
        while(right!=null) {
            if(left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static void main(String[] args) {
        XIV_Palindrome ll = new XIV_Palindrome();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(3);
        ll.addLast(2);
        ll.addLast(4);

        System.out.println(ll.checkPalindrome());
    }
}
