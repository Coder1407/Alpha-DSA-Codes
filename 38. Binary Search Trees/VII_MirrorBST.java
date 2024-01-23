public class VII_MirrorBST {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void printInOrder(Node root) {
        if (root == null) {
            return;
        }

        printInOrder(root.left);
        System.out.print(root.data + " ");
        printInOrder(root.right);
    }

    public static Node mirrorBST(Node root) {
        if(root == null) {
            return null;
        }

        Node leftS = mirrorBST(root.left);
        Node rightS = mirrorBST(root.right);

        root.left = rightS;
        root.right = leftS;

        return root;
    }
    public static void main(String[] args) {
        /*
                    8                                       
                   / \
                  5   10
                 / \    \          
                3   6    11
               / \         \
              1   4         14

        */

        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.left.left.left = new Node(1);
        root.left.left.right = new Node(4);
        root.right.right = new Node(11);
        root.right.right.right = new Node(14);

        System.out.print("Inorder traversal: ");
        printInOrder(root);
        System.out.println();

        root = mirrorBST(root);
        System.out.print("Mirror Inorder traversal: ");
        printInOrder(root);
        System.out.println();
    }
}
