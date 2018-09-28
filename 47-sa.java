class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
         if (nums == null) {
             return results; 
         }
         Arrays.sort(nums);//排序防重复，重要！
         boolean[] flag = new boolean[nums.length];   
         List<Integer> permutation = new ArrayList<Integer>();
         helper(nums, flag,permutation, results);
         return results;
    }    
    private void helper(int[] nums,boolean[] flag,List<Integer> permutation,List<List<Integer>> results)
    {
        if (permutation.size() == nums.length) {
            results.add(new ArrayList<Integer>(permutation));
            return;
        }

                
        // [3] => [3,1], [3,2], [3,4] ...
        for (int i = 0; i < nums.length; i++) {
           // System.out.println(flag[i]);
            if(flag[i])
            {
                continue;
            }
            if(i > 0 && nums[i] == nums[i - 1]&&flag[i-1])
            {
                continue;
            }
            
            permutation.add(nums[i]);
           // System.out.println(permutation);
            flag[i]=true;
            helper(nums, flag,permutation,results);
            flag[i]=false;
            permutation.remove(permutation.size() - 1);
        }
        
    }
}