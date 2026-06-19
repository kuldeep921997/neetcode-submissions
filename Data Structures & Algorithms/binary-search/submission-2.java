class Solution {
    public int search(int[] nums, int target) {

        int n = nums.length;
        int low = 0, high = n-1, mid; 
        
        while(low<=high){
            // Naive approach:
            // mid = (low + high) / 2;
            // Can overflow when low and high are very large (close to Integer.MAX_VALUE).

            // Alternative approach using bit shift:
            // mid = (low + high) >>> 1;
            // Same as (low + high) / 2 in terms of result if no overflow happens.
            // Still unsafe because (low + high) itself can overflow in Java.
            // Modern JVM already optimizes (a + b) / 2 to a shift internally,
            // so no performance gain compared to the safe formula.

            // Best practice: Always use 
            mid = low + (high - low) / 2;
            //  It is safe, efficient, and clear.


            int curr = nums[mid];

            if(curr == target) return mid;
            else if(curr > target) high = mid-1;
            else low = mid+1;
        }

        return -1;
    }
}
