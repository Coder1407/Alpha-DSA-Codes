public class VIII_ArrToBalancedBST {
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

    public static Node createBST(int arr[], int st, int end) {
        int mid = (st+end)/2;
        if(st>end) {
            return null;
        }
        Node root = new Node(arr[mid]);
        root.left = createBST(arr, st, mid-1);
        root.right = createBST(arr, mid+1, end);
        return root;
    }
    public static void main(String[] args) {
    /*
                    8                                       
                  /   \
                 5     11
                / \    / \          
               3   6  10   12
     */
    
        int arr[] = {3,5,6,8,10,11,12};
        
        Node root = createBST(arr, 0, arr.length-1);
        System.out.print("Inorder traversal: ");
        printInOrder(root);
        System.out.println();

    }
}
