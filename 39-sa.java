class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if(candidates==null||candidates.length==0)
            return res;
        Arrays.sort(candidates);
        List<Integer> combination = new ArrayList<>();
        helper(candidates, 0, target,combination,res);
        return res;
    }
    private void helper(int[] candidates, int index, int target, List<Integer> combination, List<List<Integer>> result)
    {
       // System.out.println(combination);
       // System.out.println(target);
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

            if (i != 0 && candidates[i] == candidates[i - 1]) {
                continue;
            }

            combination.add(candidates[i]);
            helper(candidates, i, target - candidates[i], combination, result);
            combination.remove(combination.size() - 1);
        }
    }
}