class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        

        int m = matrix.length;
        int n = matrix[0].length;

        int low = 0, high = n-1, mid;
        int targetRow = -1;

        for(int i=0; i<m; i++){
            int curr = matrix[i][n-1];

            if(target <= curr) {
                if(target == curr) return true;
                targetRow = i;
                break;
            }
        }

        if(targetRow == -1) return false;
        System.out.println(targetRow);

        while(low<=high){
            mid = low+(high-low)/2;
            int curr2 = matrix[targetRow][mid];
            if(curr2 == target) return true;
            else if(target < curr2) high = mid-1;
            else low = mid+1;
        }

        return false;
    }
}
