class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> rst = new ArrayList<Integer>();
        if(rowIndex<0)
            return rst;
        for(int i = 0 ; i <= rowIndex ; i++)
        {
            rst.add(0);
        }
        rst.set(0,1);
        for(int i =1;i<=rowIndex;i++)
        {
            for(int j = i;j>=0;j--)
            {
                rst.set(j,(j-1<0?0:rst.get(j-1))+rst.get(j));
            }
        }
        return rst;
    }
}