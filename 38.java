class Solution {
    public String countAndSay(int n) {
        String preString ="1";
        while(--n>0)
        {
            StringBuilder sb = new StringBuilder();
            char [] preChars = preString.toCharArray();
            for(int i =0;i<preString.length();i++)
            {
                int count = 1;
                while((i+1) < preString.length()&&preChars[i]==preChars[i+1])
                {
                    count++;
                    i++;
                }
                sb.append(String.valueOf(count)+String.valueOf(preChars[i]));
            }
            preString=sb.toString();
        }
        return preString;
    }
}