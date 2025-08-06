
class GfG {


    static ArrayList<Integer> bfs(
        ArrayList<ArrayList<Integer>> adj) {
        int V = adj.size();
        
        int s = 0;
        ArrayList<Integer> res = new ArrayList<>();
        
      
        Queue<Integer> q = new LinkedList<>();
        
     
        boolean[] visited = new boolean[V];
        
     
        visited[s] = true;
        q.add(s);
        
  
        while (!q.isEmpty()) {
            

            int curr = q.poll();
            res.add(curr);
            
           
            for (int x : adj.get(curr)) {
                if (!visited[x]) {
                    visited[x] = true;
                    q.add(x);
                }
            }
        }
        return res;
    }
}
