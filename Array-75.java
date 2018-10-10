class Solution {
    public void sortColors(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int k = 0;
        int tmp=0;
        while(k<=j)
        {
            if(nums[k]==0)
            {
                tmp=nums[i];
                nums[i]=nums[k];
                nums[k]=tmp;
                i++;
                k++;
            }
            else if(nums[k]==1)
                k++;
            else if(nums[k]==2)
            {
                tmp=nums[j];
                nums[j]=nums[k];
                nums[k]=tmp;
                j--;
            }
        }
    }
}