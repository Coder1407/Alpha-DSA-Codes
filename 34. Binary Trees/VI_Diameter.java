public class VI_Diameter {
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

    static class BinaryTree {
        static int idx = -1;
        public static Node buildTree(int nodes[]) {
            idx++;
            if(nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }


        public static int height(Node root) {
            if(root == null) {
                return 0;
            }

            int lh = height(root.left);
            int rh = height(root.right);
            int h = Math.max(lh,rh)+1;
            return h;
        }

        public static int diameter(Node root) {
            if(root == null) {
                return 0;
            }
            int leftDiam = diameter(root.left);
            int leftHt = height(root.left);
            int rightDiam = diameter(root.right);
            int rightHt = height(root.right);
            int selfDiam = leftHt + rightHt + 1;
            int diam = Math.max(Math.max(leftDiam, rightDiam), selfDiam);
            return diam;
        }
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println("Diameter = "+ tree.diameter(root));
    }
}
