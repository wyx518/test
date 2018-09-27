class Solution {
   public int firstMissingPositive(int[] A) {
        if (A == null) {
            return 1;
        }
        
        int temp = 0;
        Arrays.sort(A);
        for(int i = 0; i < A.length; i++) {
            if (A[i] <= 0) {
                continue;
            } else {
                if (A[i] - temp > 1) {
                    return temp + 1;
                } else {
                    temp = A[i];
                }
            }
        }
        
        return temp + 1;
    }
}