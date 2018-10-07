class Solution {
    public int[][] generateMatrix(int n) {
        if(n<0)
            return null;
        int[][] result =new int [n][n];
        int top=0;
        int left=0;
        int num=1;
        while(n>0)
        {
            if(n==1)
            {
                result[top][left]=num++;
                break;
            }
            for(int i =0;i<n-1;i++)
            {
                result[top][left+i]=num++;
               // System.out.println("1-"+num);
            }
            for(int i =0;i<n-1;i++)
            {
                
                result[top+i][n-1+left]=num++;
               // System.out.println("2-"+num);
            }
            for(int i =0;i<n-1;i++)
            {
                result[n-1+top][n-i-1+left]=num++;
               // System.out.println("3-"+num);
            }
            for(int i =0;i<n-1;i++)
            {
                result[n-i-1+top][left]=num++;
                //System.out.println("4-"+num);
            }
            left++;
            top++;
            n=n-2;
        }
        return result;
    }
}