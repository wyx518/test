class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res =new ArrayList<>();
        if(candidates==null||candidates.length==0)
            return res;
        Arrays.sort(candidates);
        List<Integer> combination = new ArrayList<>();
        helper(candidates, 0, target,combination,res);
        return res;
    }
    private void helper (int[] candidates,int index,int target,List<Integer> combination, List<List<Integer>> result)
    {
       // System.out.println(combination);
      //  System.out.println(target);
      //  System.out.println("index="+index);
        if(target<0)
            return;
        if(target==0)
        {
            result.add(new ArrayList<Integer>(combination));
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            if (candidates[i] > target) {
                break;
            }

            if (i != index && candidates[i] == candidates[i - 1]) {
                continue;
            }

            combination.add(candidates[i]);
         //   System.out.println("i="+i);
            helper(candidates, i+1, target - candidates[i], combination, result);
            combination.remove(combination.size() - 1);
          //  System.out.println("-------");
        }
    }
}