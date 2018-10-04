class Solution {
    public boolean canJump(int[] nums) {
         int maxReach = nums[0];
        for(int i = 1; i < nums.length; i++){
           if(i <= maxReach){
               maxReach = Math.max(maxReach, nums[i] + i);
           }else{
               return false;
           }
        }
        return true;
    }
}