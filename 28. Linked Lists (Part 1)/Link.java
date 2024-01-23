public class Link {
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
        // Step 1 - create new node
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
            return;
        }
        
        //Step 2 - newNode.next = head
        newNode.next = head;

        //Step 3 - head = newNode
        head = newNode;
    }

    public void addLast(int data) {
        size++;
        // Step 1 - create new Node
        Node newNode = new Node(data);
        if(tail == null) {
            head = tail = newNode;
            return;
        }
        // Step 2 - tail.next = newNode
        tail.next = newNode;
        // Step 3 - tail = newNode
        tail = newNode;
    }

    public void print() {
        if(head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }


    public void addMiddle(int data, int idx) {
        if(idx == 0) {
            addFirst(data);
            return;
        }
        size++;
        // create new node
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;
        while(i< idx-1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }


    public int removeFirst() {
        if(head == null) {
            System.out.println("LL is empty");
            return  Integer.MIN_VALUE;
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
        if(head == null) {
            System.out.println("LL is empty");
            return  Integer.MIN_VALUE;
        }
        else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        } 
        size--;
        Node prev = head;
        for(int i=0; i<size-2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        return val;
    }
    

    public int itrSearch(int key) {
        Node temp = head;
        int i=0;
        while(temp.next != null) {
            if(temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }


    public int helper(Node head, int key) {
        if(head == null) {
            return -1;
        }
        if(head.data == key) {
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
        Node curr = tail = head;
        Node next;
        while(curr!= null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void removeNthfromEnd(int n) {
        Node temp = head;
        int sz = 0;
        while(temp!= null) {
            temp = temp.next;
            sz++;
        }

        if(sz == n) {
            head = head.next;
            return;
        }

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

    public Node findMidNode(Node head) {
        Node slow = head;
        Node fast = head;
        
        while(fast != null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean checkPalindrome() {
        if(head == null || head.next == null) {
            return true;
        }

        Node midNode = findMidNode(head);
        
        // reverse second half
        Node curr = midNode;
        Node prev = null;
        Node next;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;

        // check left half = right half
        while(right != null) {
            if(left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static void main(String[] args) {
        Link ll = new Link();
        ll.addFirst(2);
        ll.addFirst(1);

        ll.addLast(3);
        ll.addLast(4);

        ll.print();

        ll.addMiddle(5, 2);
        ll.print();

        System.out.println(size);

        ll.removeFirst();
        ll.print();

        System.out.println(ll.itrSearch(3));
        System.out.println(ll.itrSearch(10));

        System.out.println(ll.recSearch(5));

        ll.reverse();
        ll.print();

        ll.removeNthfromEnd(3);
        ll.print();

        System.out.println(ll.checkPalindrome());
    }
}
