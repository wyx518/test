class Solution {
    public boolean isPalindrome(int x) {
        int i = 0;
        boolean flag =false;
        if(x<0)
            return false;
        String str = x + "";
        int n =str.length();
        int m=n-1;
        if(n==1)
            return true;
        while(i<n/2&&str.charAt(i++)==str.charAt(m--))
        {
            flag=true;
        }
        if(i<n/2||str.charAt(i)!=str.charAt(m))
            flag= false;
        return flag;
    }
}