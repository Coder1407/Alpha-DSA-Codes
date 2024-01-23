public class VI_ValidateBST {
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

    public static boolean isValidBST(Node root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public static boolean isValidBST(Node root, long minVal, long maxVal) {
        if(root == null) {
            return true;
        }
        if(root.data>=maxVal || root.data<=minVal) {
            return false;
        }
        return isValidBST(root.left, minVal, root.data) 
                && isValidBST(root.right, root.data, maxVal);
    }

    public static void main(String[] args) {
        /*
                        6
                       /  \   
                      3    8
                     / \   /
                    2   4  7
        
        */

        Node root = new Node(6);
        root.left = new Node(3);
        root.right = new Node(8);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.right.left = new Node(7);

        System.out.print("Inorder traversal: ");
        printInOrder(root);
        System.out.println();

        if (isValidBST(root)) {
            System.out.println("The tree is a valid BST.");
        } else {
            System.out.println("The tree is not a valid BST.");
        }
    }
}
