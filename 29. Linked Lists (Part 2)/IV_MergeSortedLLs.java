public class IV_MergeSortedLLs {
    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    public static ListNode h1;
    public static ListNode h2;

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // iterative
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        if(l1.val > l2.val) {
            ListNode temp = l1;
            l1 =l2;
            l2 = temp;
        }
        ListNode res = l1;
        while(l1!= null && l2 != null) {
            ListNode tmp = null;
            while(l1 != null && l1.val <= l2.val) {
                tmp = l1;
                l1 = l1.next;
            }
            tmp.next = l2;

            // swap
            ListNode temp = l1;
            l1 = l2;
            l2 = temp;
        }
        return res;
    }
    public static void main(String[] args) {
        h1 = new ListNode(5);
        h1.next = new ListNode(7);
        h1.next.next = new ListNode(9);
        
        h2 = new ListNode(3);
        h2.next = new ListNode(4);
        h2.next.next = new ListNode(8);
        h2.next.next.next = new ListNode(10);

        ListNode res = mergeTwoLists(h1,h2);

        //printing
        ListNode temp = res;
        while(temp!=null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
    }
}
