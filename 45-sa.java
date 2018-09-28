class Solution {
    public int jump(int[] nums) {
        int reachable = 0;
        int next = 0;
        int jump = 0;
        for (int i = 0; i < nums.length; i++){
            if (reachable < i){
                jump++;
                reachable = next;//如果不能到达，证明需要多跳一步，reachable就更新为前一个节点能到达的最远位置
            }
            next = Math.max(next,i+nums[i]);//当前i节点最远能reach的位置
        }
        return jump;

    }
}