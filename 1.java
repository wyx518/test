class Solution {
    public int[] twoSum(int[] nums, int target) {
        int temp;
        int[] res= new int[2];
        for(int i=0;i<nums.length;i++)
        {
            temp=target-nums[i];
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[j]==temp)
                {
                    res[0]=i;
                    res[1]=j;
                }
            }
        }
    return res;
    }
}