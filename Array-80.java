class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums==null||nums.length==0)
            return 0;
        int count =1;
        int j =0;
        for(int i =1;i<nums.length;i++)
        {
            if(nums[j]==nums[i])
            {
                if(count<2)
                {
                    count++;
                    nums[++j]=nums[i];
                }
            }
            else
            {
                nums[++j]=nums[i];
                count=1;
            }
        }
        return j+1;
    }
}