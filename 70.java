class Solution {
    public int climbStairs(int n) {
        if(n==1)
            return 1;
        if(n==2)
            return 2;
       // return climbStairs(n-1)+climbStairs(n-2);*/
        //递归形式斐波拉契数列超时
        int f1=1;
        int f2=2;
        int c=0;
        for(int i=2;i<n;i++)
        {
            c=f1+f2;
            f1=f2;
            f2=c;
        }
        return c;
    }
}