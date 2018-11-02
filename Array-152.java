class Solution {
    public int maxProduct(int[] nums) {
        int[] pos=new int[nums.length];
        int[] neg=new int[nums.length];
        
        int result = nums[0];
        pos[0]=neg[0]=nums[0];
        for(int i =1;i<nums.length;i++)
        {
            pos[i]=neg[i]=nums[i];
            if(nums[i]>0)
            {
                pos[i]=Math.max(pos[i],pos[i-1]*nums[i]);
                neg[i]=Math.min(neg[i],neg[i-1]*nums[i]);
            }
            else if(nums[i]<0)
            {
                pos[i]=Math.max(pos[i],neg[i-1]*nums[i]);
                neg[i]=Math.min(neg[i],pos[i-1]*nums[i]);
            }
            result = Math.max(result,pos[i]);
        }
        return result;
    }
}