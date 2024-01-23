import java.util.*;
public class XI_Merge2BSTs {
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

    public static void getInorder(Node root, ArrayList<Integer> inorder) {
        if (root == null) {
            return;
        }

        getInorder(root.left, inorder);
        inorder.add(root.data);
        getInorder(root.right, inorder);
    }

    public static Node createBST(ArrayList<Integer> inorder, int st, int end) {
        int mid = (st+end)/2;
        if(st>end) {
            return null;
        }
        Node root = new Node(inorder.get(mid));
        root.left = createBST(inorder, st, mid-1);
        root.right = createBST(inorder, mid+1, end);
        return root;
    }


    public static Node mergeBSTs(Node root1, Node root2) {
        // getting inorder sequence from both BTs
        ArrayList<Integer> arr1 = new ArrayList<>();
        getInorder(root1, arr1);
        ArrayList<Integer> arr2 = new ArrayList<>();
        getInorder(root2, arr2);

        // merging the sequences
        int i=0, j=0;
        ArrayList<Integer> finalArr = new ArrayList<>();
        while(i<arr1.size() && j<arr2.size()) {
            if(arr1.get(i) <= arr2.get(j)) {
                finalArr.add(arr1.get(i));
                i++;
            }
            else {
                finalArr.add(arr2.get(j));
                j++;
            }
        }
        while(i<arr1.size()) {
            finalArr.add(arr1.get(i));
            i++;
        }
        while(j<arr2.size()) {
            finalArr.add(arr2.get(j));
            j++;
        }

        // creating merged BST from sorted AL
        Node root = createBST(finalArr, 0, finalArr.size()-1);
        return root;
    }
    public static void main(String[] args) {
        /*
            BST 1:
                    2
                   / \
                  1   4
         */

        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);
        
        /*
            BST 2:
                    9
                   / \
                  3   12
         */
        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);
        /*
            Expected BST:
                    3                                       
                  /   \
                 1     9
                  \    / \          
                   2  4   12
        */
    
        Node root = mergeBSTs(root1, root2);
        System.out.print("Merged BST Inorder traversal: ");
        printInOrder(root);
        System.out.println();
    }
}
