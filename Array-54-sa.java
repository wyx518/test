if(matrix == null || matrix.length == 0){
            return result;
        }
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        int n = matrix.length;
        int m = matrix[0].length;
        while(n > 1 && m > 1){
            for(int i = 0; i < m - 1; i++){
                result.add(matrix[top][left + i]);
            }
            for(int i = 0; i < n - 1; i++){
                result.add(matrix[top + i][right]);
            }
            for(int i = 0; i < m - 1; i++){
                result.add(matrix[bottom][right - i]);
            }
            for(int i = 0; i < n - 1; i++){
                result.add(matrix[bottom - i][left]);
            }
            top++;
            left++;
            bottom--;
            right--;
            n -= 2;
            m -= 2;
        }
        if(left == right){
            for(int i = top; i <= bottom; i++){
                result.add(matrix[i][left]);
            }
            return result;
        }
        if(top == bottom){
            for(int i = left; i <= right; i++){
                result.add(matrix[top][i]);
            }
            return result;
        }
        return result;