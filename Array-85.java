class Solution {
    public int maximalRectangle(char[][] matrix) {
        int ans = 0;
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return ans;
        }
        int n = matrix.length;
        int m = matrix[0].length;
        int[] height = new int[m + 1];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if (matrix[i][j]=='1'){
                    height[j] = height[j] + 1;
                } else {
                    height[j] = 0;
                }
            }
            ans = Math.max(ans, histMax(height));
        }
        return ans;
    }
    public int histMax(int[] height){
        int ans = 0;
        Deque<Integer> deque = new ArrayDeque<>();//deque 可以当作栈使用 后进先出
        for (int i = 0; i < height.length; i++){
            while (!deque.isEmpty() && height[i] <= height[deque.peek()]){
                int h = height[deque.pop()];
                int w = deque.isEmpty() ? i : i - deque.peek() - 1;
                ans = Math.max(ans, h * w);
            }
            deque.push(i);
        }
        return ans;
    }
}