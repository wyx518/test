class Solution {
    public boolean search(int[] A, int target) {
        if (A == null || A.length == 0) {
            return false;
        }
        
        int start = 0, end = A.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (A[mid] == A[start]) {
                start++;
            } else if (A[mid] == A[end]) {
                end--;
            } else if (A[end] >= target) { // target is less than A[end] means target is in right part
                if (A[mid] > A[end]) { // we search from right part
                    start = mid;
                } else if (target <= A[mid]) {
                    end = mid;
                } else {
                    start = mid;
                }
            } else { // target is in left part
                if (A[mid] < target && A[mid] < A[end]) {
                    end = mid;
                } else if (A[mid] < target) {
                    start = mid;
                } else {
                    end = mid;
                }
            }
        }
        
        if (A[start] == target) {
            return true;
        } else if (A[end] == target){
            return true;
        }
        return false;
    }
}