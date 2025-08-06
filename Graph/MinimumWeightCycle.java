

public class Solution {


    static ArrayList<ArrayList<int[]>> constructAdj(int V, int[][] edges) {
        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());

        for (int[] edge : edges) {
            int u = edge[0], v = edge[1], w = edge[2];
            adj.get(u).add(new int[]{v, w});
            adj.get(v).add(new int[]{u, w});
        }
        return adj;
    }
   
    static int minCycle;

    static void dfs(int u, int parent,ArrayList<ArrayList<int[]>> adj,
                    boolean[] visited, ArrayList<Integer> path,
                    ArrayList<Integer> weights,int currWeight) {

        visited[u] = true;
        path.add(u);

        for (int[] edge : adj.get(u)) {
            int v = edge[0];
            int w = edge[1];

            if (v == parent) continue;

            if (!visited[v]) {
                weights.add(w);
                dfs(v, u, adj, visited, path, weights, currWeight + w);
                weights.remove(weights.size() - 1);
            } else {

                int idx = path.indexOf(v);
                if (idx != -1) {
                    int cycleWeight = 0;
                    for (int i = idx; i < weights.size(); i++) {
                        cycleWeight += weights.get(i);
                    }

                    cycleWeight += w;
                    minCycle = Math.min(minCycle, cycleWeight);
                }
            }
        }

        path.remove(path.size() - 1);
        visited[u] = false;
    }

    static int findMinCycle(int V, int[][] edges) {
        ArrayList<ArrayList<int[]>> adj = constructAdj(V, edges);
        minCycle = Integer.MAX_VALUE;

        boolean[] visited = new boolean[V];
        ArrayList<Integer> path = new ArrayList<>();
        ArrayList<Integer> weights = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            dfs(i, -1, adj, visited, path, weights, 0);
        }

        return minCycle;
    }
}
