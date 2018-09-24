class Solution {
    public int strStr(String haystack, String needle) {
        //超出时间限制
        if(haystack.equals(needle))
            return 0;
        if(needle==null||haystack==null)
            return -1;
        if (needle.length() > haystack.length()) {
            
            return -1;
        }
        if ("".equals(haystack)) {
            if ("".equals(needle)) {
                return 0;
            } else {
                return -1;
            }
        } else {
            if ("".equals(needle)) {
                return 0;
            }
        }
        for(int i = 0;i<haystack.length()-1;i++)
        {
            //System.out.println(haystack.length());
            int j;
            int k=i;
            for(j = 0;j<needle.length();j++)
            {
                
                //System.out.println("i:"+i);
               // System.out.println("j:"+j);
              //  System.out.println("k:"+k);
               // System.out.println(haystack.charAt(10));
                if(needle.charAt(j)!=haystack.charAt(k))
                    break;
                if(k<haystack.length()-1)
                    k++;
                if(j==needle.length()&&k==haystack.length())
                {
                   // System.out.println("----");
                    return -1;
                }
                
            }
            if(j==needle.length())
            {
                return i;
            }
        }
      //  System.out.println("--?--");
        return -1;
    }
}