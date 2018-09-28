class Solution {
    public List<List<Integer>> permute(int[] nums) {
         List<List<Integer>> results = new ArrayList<>();
         if (nums == null) {
             return results; 
         }
         
         // if (nums.length == 0) {
         //    results.add(new ArrayList<Integer>());
         //    return results;
         // }

         List<Integer> permutation = new ArrayList<Integer>();
         Set<Integer> set = new HashSet<>();
         helper(nums, permutation, set, results);
         return results;
    }    
    private void helper(int[] nums,List<Integer> permutation,Set<Integer> set,List<List<Integer>> results)
    {
        if (permutation.size() == nums.length) {
            results.add(new ArrayList<Integer>(permutation));
            return;
        }

                
        // [3] => [3,1], [3,2], [3,4] ...
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
           //     System.out.println("tiao");
                continue;
            }
            
            permutation.add(nums[i]);
            set.add(nums[i]);
          //  System.out.println(i);
           // System.out.println("1"+set);
            helper(nums, permutation, set, results);
            set.remove(nums[i]);
           // System.out.println("2"+set);
            permutation.remove(permutation.size() - 1);
        }
        
    }
}