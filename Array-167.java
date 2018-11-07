class Solution {
    public int[] twoSum(int[] numbers, int target) {
        if(numbers==null||numbers.length==0)
            return new int[0];
        int start = 0;
        int end = numbers.length-1;
        int[] res=new int [2];
        while(start<end)
        {
            int sum=numbers[start]+numbers[end];
            if(sum>target)
                end--;
            else if(sum<target)
                start++;
            else{
                res[0]=start+1;
                res[1]=end+1;
                return res;
            }
        }
        return new int[0];
    }
}