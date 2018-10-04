class Solution {
    public int maxSubArray(int[] nums) {
        if(nums==null||nums.length==0)
        {
            return 0;
        }
        int res=0;
        int tmp=Integer.MIN_VALUE;
        for(int i =0;i<nums.length;i++)
        {
            res+=nums[i];
            tmp=Math.max(res,tmp);
            res=Math.max(res,0);
        }
        return tmp;
    }
}