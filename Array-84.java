class Solution {
    public int largestRectangleArea(int[] heights) {
        if (heights == null || heights.length == 0) {
            return 0;
        }
        if (heights.length == 1) {
            return heights[0];
        }
        
        int max = Integer.MIN_VALUE;
        int n = heights.length;
        int l, r;
        
        for (int i = 0; i < n; i++) {
            l = i;
            r = i;
            while (l - 1 >= 0 && heights[l - 1] >= heights[i]) {
                l--;
            }
            while (r + 1 <= n - 1 && heights[r + 1] >= heights[i]) {
                r++;
            }
            max = Math.max(max, (r - l + 1) * heights[i]);
        }
        
        return max;
    }
}