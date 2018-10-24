class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        
        if (nums == null) {
            return results;
        }
        
        if (nums.length == 0) {
            results.add(new ArrayList<Integer>());
            return results;
        }
        
        Arrays.sort(nums);
        helper(new ArrayList<Integer>(), nums, 0, results);
        return results;
    }
    
    
    // 递归三要素
    // 1. 递归的定义：在 Nums 中找到所有以 subset 开头的的集合，并放到 results
    private void helper(ArrayList<Integer> subset,
                        int[] nums,
                        int startIndex,
                        List<List<Integer>> results) {
        // 2. 递归的拆解
        // deep copy
        // results.add(subset);
      //  if(!results.contains(subset))
        //用contains()想法确实比较简单，但是list的contains()方法内部是用indexOf实现的，实际上是把整个list遍历一遍判断是否contain的，所以contains()时间复杂度O(n)。从这个角度考虑的话，contains()虽然简单好想但是效果不如直接跳过重复元素
            results.add(new ArrayList<Integer>(subset));
        
        for (int i = startIndex; i < nums.length; i++) {
            // [1] -> [1,2]
            if (i != startIndex && nums[i]==nums[i-1]) {
                continue;
            }
            subset.add(nums[i]);
            // 寻找所有以 [1,2] 开头的集合，并扔到 results
            helper(subset, nums, i + 1, results);
            // [1,2] -> [1]  回溯
            subset.remove(subset.size() - 1); 
        }
        
        // 3. 递归的出口
    }
}