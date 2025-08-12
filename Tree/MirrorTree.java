class GfG {

    static void mirror(Node root) {
        if (root == null)
            return ;

		mirror(root.left);
		mirror(root.right);

        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
    }

    static void levelOrder(Node root) {
        if (root == null) {
            System.out.print("N ");
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node curr = queue.poll();

            if (curr == null) {
                System.out.print("N ");
                continue;
            }
            System.out.print(curr.data + " ");
            queue.add(curr.left);
            queue.add(curr.right);
        }
    }
