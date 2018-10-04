class Solution {
    public int maxSubArray(int[] nums) {
        
        int sum = Integer.MIN_VALUE;; 
        
        int total_sum = 0;
        int i = 0; 
        while(i < nums.length){
            total_sum += nums[i];
            sum = Math.max(sum, total_sum);
            if(total_sum < 0){
                total_sum = 0 ;
            }

            i++;
        }
      
        return sum;
    }
}