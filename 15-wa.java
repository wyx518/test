class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        
        int tmp=0;
        int res=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length-1;)
            {
                tmp=nums[i]+nums[j];
                res=0-tmp;
                if(nums[++j]==res)
                {
                    List<Integer> list = new ArrayList<>(3);
                    list.add(nums[i]);
                    list.add(nums[j-1]);
                    list.add(nums[j]);
                    //不能避免重复
                    if(!result.contains(list))
                    {
                        result.add(list);
                    }
                }
            }
            
        }
        return result;
    }
}