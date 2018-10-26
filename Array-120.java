class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle==null)
            return 0;
        int len = triangle.size();
        int[] tmp =new int [len];
        for(int i =0;i<len;i++)
        {
            tmp[i]=triangle.get(len-1).get(i);
        }
        for(int i=len-2;i>=0;i--)
        {
            for(int j=0;j<triangle.get(i).size();j++)
            {
                tmp[j]=triangle.get(i).get(j)+Math.min(tmp[j],tmp[j+1]);
            }
        }
        return tmp[0];
        
    }
}