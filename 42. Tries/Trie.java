class Node {
    Node links[] = new Node[26];
    boolean flag = false;

    boolean containsKey(char ch) {
        return (links[ch-'a'] != null);
    }

    void put(char ch, Node node) {
        links[ch-'a'] = node;
    }

    Node get(char ch) {
        return links[ch-'a'];
    }
}
public class Trie {
    private static Node root;

    // Initialize trie data structure
    Trie() {
        root = new Node();
    }

    // Insert a word into trie
    public static void insert(String word) {
        Node node = root;
        for(int i=0; i<word.length(); i++) {
            if(!node.containsKey(word.charAt(i))) {
                node.put(word.charAt(i), new Node());
            }
            node = node.get(word.charAt(i));
        }
    }
}