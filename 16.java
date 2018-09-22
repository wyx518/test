class Solution {
    public int threeSumClosest(int[] nums, int target) {
        // 记录最小的差值
        long minDiff = Long.MAX_VALUE;
        // 记录最小差值对应的三个整数和
        long result = 0;
        // 每次求得的差值
        long diff;
        // 每次求得的三个整数的和
        long sum;
        // 先对数组进行排序
        Arrays.sort(nums);//重要
        // i表示假设取第i个数作为结果
        for (int i = 0; i < nums.length - 2;i++ ) {
            // 第二个数可能的起始位置
            int j = i + 1;
            // 第三个数可能是结束位置
            int k = nums.length - 1;
            while (j < k) {
                sum=nums[i]+nums[j]+nums[k];
                diff = Math.abs(target - sum);
               // diff=sum-target;
                if(diff==0)
                    return (int)sum;
                if(diff<minDiff)
                {
                    minDiff=diff;
                    result=sum;
                }
                if(sum>target)
                    k--;
                else 
                    j++;
            }
        }      
        return (int)result;
    }
}