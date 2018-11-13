class Solution {
    public int lengthOfLastWord(String s) {
        int res=0;
        for(int i =s.length()-1;i>=0;i--)
        {
            if(res==0)
            {
                if(s.charAt(i)==' ')
                    continue;
                else
                    res++;
            }
            else
            {
                if(s.charAt(i)==' ')
                    break;
                else
                    res++;
            }
        }
        return res;
    }
}