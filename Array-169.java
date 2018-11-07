class Solution {
    public int majorityElement(int[] nums) {
        int res=0;
        if(nums==null || nums.length==0){
            return 0;
        }
        if(nums.length==1)
            return nums[0];
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int j=i + 1;
            while(j<nums.length && nums[j]==nums[i]){
                if(j - i + 1>nums.length / 2){
                    res = nums[i];
                }
                j++;
            }
        }
        return res;
    }
}