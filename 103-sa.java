public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        // Set up
        List<List<Integer>> results = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        
        // Edge case
        if (root == null) {
            return results;
        }
        
        /* Idea:
           1. BFS to access each layer from left to right
           2. If current layer needed to be read from right to left, reverse curLayer
           3. Add to results
        */
        queue.offer(root);
        boolean leftToRight = true;
        while (!queue.isEmpty()) {
            // 1. BFS to access each layer from left to right
            int layerSize = queue.size();
            List<Integer> curLayer = new ArrayList<Integer>();
            for (int i = 0; i < layerSize; i++) {
                TreeNode node = queue.poll();
                curLayer.add(node.val);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            
            // 2. Reverse if needed
            if (!leftToRight) {
                Collections.reverse(curLayer);
            }
            leftToRight = !leftToRight;
            
            // 3. Add to results
            results.add(curLayer);
        }
        
        
        return results;
    }