

public class GfG {

    
    public static Node cloneGraph(Node node) {
        if (node == null) return null;

        Map<Node, Node> mp = new HashMap<>();
        Queue<Node> q = new LinkedList<>();


        Node clone = new Node(node.val);
        mp.put(node, clone);
        q.offer(node);

        while (!q.isEmpty()) {
            Node current = q.poll();

            for (Node neighbor : current.neighbors) {

                if (!mp.containsKey(neighbor)) {
                    mp.put(neighbor, new Node(neighbor.val));
                    q.offer(neighbor);
                }

                mp.get(current).neighbors.add(mp.get(neighbor));
            }
        }

        return mp.get(node);
    }

    public static Node buildGraph() {
        Node node1 = new Node(0);
        Node node2 = new Node(1);
        Node node3 = new Node(2);
        Node node4 = new Node(3);

        node1.neighbors.addAll(new ArrayList<>
                    (Arrays.asList(node2, node3)));
        node2.neighbors.addAll(new ArrayList<>
                    (Arrays.asList(node1, node3)));
        node3.neighbors.addAll(new ArrayList<>
                    (Arrays.asList(node1, node2, node4)));
        node4.neighbors.addAll(new ArrayList<>
                    (Arrays.asList(node3)));

        return node1;
    }


    public static boolean compareGraphs(Node n1, Node n2, 
                             HashMap<Node, Node> visited) {
        if (n1 == null || n2 == null)
            return n1 == n2;

        if (n1.val != n2.val || n1 == n2)
            return false;

        visited.put(n1, n2);

        if (n1.neighbors.size() != n2.neighbors.size())
            return false;

        for (int i = 0; i < n1.neighbors.size(); i++) {
            Node neighbor1 = n1.neighbors.get(i);
            Node neighbor2 = n2.neighbors.get(i);

            if (visited.containsKey(neighbor1)) {
                if (visited.get(neighbor1) != neighbor2)
                    return false;
            } else {
                if (!compareGraphs(neighbor1, neighbor2, visited))
                    return false;
            }
        }

        return true;
    }

}
