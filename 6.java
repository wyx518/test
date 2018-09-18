class Solution {
    public String convert(String s, int numRows) {

        if (numRows == 1) return s;

        StringBuilder ret = new StringBuilder();
        int n = s.length();
        int cycleLen = 2 * numRows - 2;

       for(int i=0;i<numRows;i++)
       {
           for(int j=i;j<n;j += cycleLen)
           {
               ret.append(s.charAt(j));
               int tmp = j + cycleLen - 2 * i;
               if(i != 0 && i != numRows - 1 &&tmp<s.length())
                   ret.append(s.charAt(tmp));
           }
       }
        return ret.toString();
    }
}