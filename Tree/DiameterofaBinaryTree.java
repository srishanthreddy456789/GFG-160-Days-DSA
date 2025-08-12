class GfG {


    static int diameterRecur(Node root, int[] res) {

        if (root == null)
            return 0;

        int lHeight = diameterRecur(root.left, res);
        int rHeight = diameterRecur(root.right, res);

    
        res[0] = Math.max(res[0], lHeight + rHeight);

        return 1 + Math.max(lHeight, rHeight);
    }
}
