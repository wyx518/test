class Solution {
    public boolean isValid(String s) {
        String left = "({[";
        String right = ")}]";

        Deque<Character> stack = new LinkedList<Character>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (left.contains("" + c)) {
                stack.push(c);
            } else if (right.contains("" + c)) {
                if (stack.isEmpty()) {
                    return false;
                }

                if (left.indexOf(stack.pop()) != right.indexOf(c)) {
                    return false;
                }
            }
        }

        if (stack.isEmpty()) {
            return true;
        }

        return false;
    }
}