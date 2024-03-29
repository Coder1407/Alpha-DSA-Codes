public class X_KthLevel {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void KLevel(Node root, int lvl, int k) {
        if(root == null) {
            return;
        }
        if(lvl==k) {
            System.out.print(root.data+" ");
            return;
        }
        KLevel(root.left, lvl+1, k);
        KLevel(root.right, lvl+1, k);
    }
    public static void main(String[] args) {
         /*
                    1
                   / \
                  2   3
                 / \ / \
                4  5 6  7  
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        KLevel(root, 1, 3);
    }
}
