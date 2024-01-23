public class XII_MinDistance {
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

    public static Node lowestCommonAncestor(Node root, Node p, Node q) {
        //base case
        if (root == null || root == p || root == q) {
            return root;
        }
        Node left = lowestCommonAncestor(root.left, p, q);
        Node right = lowestCommonAncestor(root.right, p, q);

        //result
        if(left == null) {
            return right;
        }
        else if(right == null) {
            return left;
        }
        else { //both left and right are not null, we found our result
            return root;
        }
    }

    public static int lcaDist(Node root, int n) {
        if(root == null) {
            return -1;
        }

        if(root.data == n) {
            return 0;
        }

        int leftDist = lcaDist(root.left, n);
        int rightDist = lcaDist(root.right, n);

        if(leftDist == -1 && rightDist == -1) {
            return -1;
        }
        else if(leftDist == -1) {
            return rightDist+1;
        }
        else {
            return leftDist+1;
        }
    }
    public static int minDist(Node root, Node p, Node q) {
        Node lca = lowestCommonAncestor(root, p, q);
        int dist1 = lcaDist(lca, p.data);
        int dist2 = lcaDist(lca, q.data);
        return dist1 + dist2;
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
        System.out.println("Minimum Distance = "+minDist(root, root.left.right, root.right.left));
    }
}
