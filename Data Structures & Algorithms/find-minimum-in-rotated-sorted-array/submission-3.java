class Solution {
    public int findMin(int[] nums) {

        int n = nums.length;
        int low = 0, high = n-1;
        int mid =- 1;

        // Manage the limit and crossing condition.
        while(low < high){
            // if Sorted.
            mid = low+(high-low)/2;

            if(nums[mid] > nums[high]){
                low = mid+1;
            }
            else{
                // Initial logic but it is not efficient.
                // it does linear search in sorted part.
                // high = high-1; 

                // Correct and optimal logic:
                high = mid;
            }
        }

        // high actually crosses low and 
        // low contains the actual low value.
        return nums[low];
    }
}
