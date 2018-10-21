class Solution {
     public int maximalRectangle(char[][] matrix) {
            if(matrix.length == 0)
                return 0;
            int max = 0;
            int m = matrix.length;
            int n = matrix[m-1].length;

            int[][] metrix = new int[m][n];
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(j==0){
                        if(matrix[i][j]=='1'){
                            metrix[i][j]= 1;
                        }
                        else
                            metrix[i][j] = 0;
                    }
                    else{
                        if(matrix[i][j]=='0')
                            metrix[i][j]=0;
                        else{
                            metrix[i][j] = metrix[i][j-1]+1;
                        }
                    }
                }
            }

            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(metrix[i][j]==0)
                        continue;
                    int count = 1;
                    for(int k = i-1;k>=0 && metrix[k][j]>=metrix[i][j];k--,count++);
                    for(int k = i+1;k<m && metrix[k][j]>=metrix[i][j];k++,count++);
                    max=Math.max(max,metrix[i][j] * count);
                }
            }
            return max;
        }
}