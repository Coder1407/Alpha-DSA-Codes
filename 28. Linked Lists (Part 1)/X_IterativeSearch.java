public class X_IterativeSearch {
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
    public static void main(String[] args) {
        X_IterativeSearch ll = new X_IterativeSearch();

        System.out.println(ll.itrSearch(3));
        System.out.println(ll.itrSearch(10));
    }
}
