class Solution {
    public int mySqrt(int x) {
        long X = (long) x;
        long l = 1, r = X;
         while (l + 1 < r)
        {
          //  long mid=l+(r-1)/2;
            long mid = l + (r - l) / 2;
            if(mid*mid==X)
            {return (int) mid;}
            else if(mid*mid<X){
                l=mid;}
            else {
                r=mid;}
        }
        if(r*r==X)
            return (int) r;
        return (int) l;
    }
}