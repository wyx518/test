class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length==0)
            return "";
        for(int i =0;i<strs[0].length();i++)
        {
            for(int j=0;j<strs.length-1;j++)
            {
                if(i>=strs[j].length()||i>=strs[j+1].length()||strs[j].charAt(i)!=strs[j+1].charAt(i))   
                    return strs[j].substring(0,i);
            }
        }        
        return strs[0];
    }
}