class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        //超出时间限制
        List<List<Integer>> result = new LinkedList<>();
        if(nums==null||nums.length<4)
            return result;
        int n = nums.length;
        int sum = 0 ;
        int tmp = 0;
        Arrays.sort(nums);
        for(int i = 0;i<n-3;i++)
        {
            if(i>0&&nums[i]==nums[i+1])
                continue;
            {
                for(int j = n-1;j>i+2;j--)
                {
                    if(j<n-1&&nums[j]==nums[j-1])
                        continue;
                    int l = i+1;
                    int r = j-1;
                    tmp=target-nums[i]-nums[j];
                    while(l<r)
                        {
                            if(nums[l]+nums[r]==tmp)
                            {
                                List<Integer> list = new ArrayList<>(4);
                                list.add(nums[i]);
                                list.add(nums[l]);
                                list.add(nums[r]);
                                list.add(nums[j]);
                                result.add(list);
                            }
                            while(l<r&&nums[l]==nums[l+1])
                                l++;
                            while(l<r&&nums[r]==nums[r-1])
                                r--;
                            while(l<r&&nums[l]+nums[r]<tmp)
                                l++;
                            while(l<r&&nums[l]+nums[r]>tmp)
                                r--;
                        }
                }
            }
        }
        return result;
    }
}