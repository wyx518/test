class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0;i<board.length;i++)
        {
            int[] count1=new int[9];
            for(int j=0;j<board[0].length;j++)
            {
                if(Character.isDigit(board[i][j]))
                {
                    count1[board[i][j]-'1']++;
                }
            }
            if(!valid(count1))
            {
                //System.out.println("count1 valid!");
                return false;
            }
        }
        for(int j = 0;j<board[0].length;j++)
        {
            int[] count2=new int[9];
            for(int i=0;i<board.length;i++)
            {
                if(Character.isDigit(board[i][j]))
                {
                    count2[board[i][j]-'1']++;
                }
            }
            if(!valid(count2))
            {
               // System.out.println("count2 valid!");
                return false;
            }
        }
        for(int i = 0;i<board.length;i+=3)
        {
            for(int j = 0;j<board[0].length;j+=3)
            {
                if(!boardValid(i, j, board)){
                //    System.out.println("board valid!");
                    return false;
                }
            }
        }
        return true;
    }
    private boolean valid(int[] count)
    {
        for(int i =0;i<count.length;i++)
        {
            if(count[i]>1)
                return false;
        }
        return true;
    }
    private boolean boardValid(int i,int j,char board[][])
    {
        int[] count1=new int[9];
        for(int m=i;m<i+3;m++)
        {
            for(int n=j;n<j+3;n++)
            {
                if(Character.isDigit(board[m][n]))
                {
                    count1[board[m][n]-'1']++;
                }
            }
        }
        if(valid(count1))
            {
                return true;
            }
        return false;
    }
}