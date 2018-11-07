class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
		int res = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if(res==nums[i]) {
				count++;
			}else {
				count--;
				if(count==0) {
				   res=nums[i];
				   count++;
				}
			}
		}
		return res;
    }
}