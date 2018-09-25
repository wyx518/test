class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        int max = 0;
        for(int i = 0;i<s.length();i++)
        {
            if(!st.isEmpty()&&s.charAt(i)==')'&&s.charAt(st.peek())=='(')
            {
                st.pop();
                max=Math.max(max,i-(st.isEmpty()?-1:st.peek()));
            }
            else st.push(i);
        }
        return max;
    }
}