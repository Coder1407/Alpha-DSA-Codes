public class I_Creation {
    static class Node {
        Node children[] = new Node[26];
        boolean eow = false;

        Node() {
            for(int i=0; i<26; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;

        for(int lvl=0; lvl<word.length(); lvl++) {
            int idx = word.charAt(lvl) - 'a';
            if(curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }
    public static void main(String[] args) {
        String words[] = {"the", "a", "there", "their", "any", "thee"};
        for(int i=0; i<words.length; i++) {
            insert(words[i]);
        }
    }
}
