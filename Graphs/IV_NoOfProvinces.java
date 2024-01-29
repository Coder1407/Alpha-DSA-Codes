import java.util.*;
public class IV_NoOfProvinces {
    public static void dfs(int node, boolean vis[], ArrayList<ArrayList<Integer>> adj) {
        vis[node] = true;
        for(Integer it: adj.get(node)) {
            if(vis[it] == false) {
                dfs(it, vis, adj);
            }
        }
    }

    public static int numProvinces(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean vis[] = new boolean[V+1];
        int cnt=0;
        for(int i=1; i<V; i++) {
            if(vis[i]==false) {
                cnt++;
                dfs(i, vis, adj);
            }
        }
        return cnt;
    }
    
    public static void main(String args[]) {

        int V=8;
        ArrayList < ArrayList < Integer >> adj = new ArrayList < > ();
        for (int i = 0; i <=V; i++) {
            adj.add(new ArrayList < > ());
        }

        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(2).add(3);
        adj.get(3).add(2);
        adj.get(4).add(5);
        adj.get(5).add(4);
        adj.get(5).add(6);
        adj.get(6).add(5);
        adj.get(7).add(8);
        adj.get(8).add(7);
        
        System.out.println("Number of provinces = "+numProvinces(V, adj));
    }
}
