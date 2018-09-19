class Solution {
    public int myAtoi(String str) {
       // if (str.isEmpty())
        if(str.length()==0)
            return 0;
        int i =0;
        int n =str.length();
        int sign=1;
        int tmp=0;
        while(i<n&&str.charAt(i)==' ')
            i++;
        if(i<n&&str.charAt(i)=='+')
        {
            sign=1;
            i++;
        }
        else if(i<n&&str.charAt(i)=='-')
        {
            sign=-1;
            i++;
        }
        while(i<n&&str.charAt(i)>='0'&&str.charAt(i)<='9')
        {
            if (tmp > Integer.MAX_VALUE / 10 || (tmp == Integer.MAX_VALUE / 10 && str.charAt(i) - '0' > 7)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            tmp=10*tmp+(str.charAt(i++)-'0');//ascii

        }
       // System.out.println(tmp);
       // System.out.println(sign);
        return sign*tmp;
        
    }
}