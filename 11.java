class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int tmp=0;
        int j=height.length-1;
        while (i<j)
        {
            int h = Math.min(height[i],height[j]);
            tmp =Math.max(tmp,h*(j-i));
            if(height[i]<height[j])
                i++;
            else j--;
        }
        return tmp;
        
    }
}