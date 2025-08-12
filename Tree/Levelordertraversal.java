public class GfG{
    public static List<List<Integer>> levelOrder(Node root) {
        if (root == null)
            return new ArrayList<>();

        
        Queue<Node> q = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();

       
        q.offer(root);
        int currLevel = 0;

        while (!q.isEmpty()) {
            int len = q.size();
            res.add(new ArrayList<>());

            for (int i = 0; i < len; i++) {
            
                Node node = q.poll();
                res.get(currLevel).add(node.data);

            
                if (node.left != null)
                    q.offer(node.left);

                if (node.right != null)
                    q.offer(node.right);
            }
            currLevel++;
        }
        return res;
    }
}
