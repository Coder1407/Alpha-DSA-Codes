public class II_SearchinBST {
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
    public static Node insert(Node root, int val) {
        if(root == null) {
            root = new Node(val);
            return root;
        }

        if(root.data > val) {
            // left subtree
            root.left = insert(root.left, val);
        }
        else {
            //right subtree
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static boolean search(Node root, int key) {
        if(root == null) {
            return false;
        }

        if(root.data == key) {
            return true;
        }

        if(root.data > key ) {
            return search(root.left, key);
        }
        else {
            return search(root.right, key);
        }
    }

    public static Node search2(Node root, int key) {
        while(root!=null && root.data!=key) {
            root = root.data>key? root.left : root.right;
        }
        return root;
    }

    public static void main(String[] args) {
        int values[] = {5,1,3,4,2,7};
        Node root = null;

        for(int i=0; i<values.length; i++) {
            root = insert(root, values[i]);
        }

        // if(search(root, 6)) {
        //     System.out.println("found");
        // }
        // else {
        //     System.out.println("Not found");
        // }

        Node found = search2(root,4);
        if(found != null) {
            System.out.println("Node value with given target found");
        }
        else {
            System.out.println("Node value with given target not found");
        }
    }
}
