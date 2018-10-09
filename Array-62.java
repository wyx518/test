class Solution {
    public int uniquePaths(int m, int n) {
        if(m==1||n==1)
            return 1;
        int tmp=(m>=n)?n:m;
        long bigtmp=(m<n)?n:m;
        long flag=bigtmp;
        int tmp1=1;
        int tmp2=1;
        for(int i=tmp-1;i>1;i--)
        {
            tmp1*=i;
           // System.out.println("i="+i);
            bigtmp*=(flag+i-1);
          //  System.out.println(bigtmp);
           // System.out.println(tmp1);
        }
        int res = new Long(bigtmp/tmp1).intValue();
        return res;
    }
}