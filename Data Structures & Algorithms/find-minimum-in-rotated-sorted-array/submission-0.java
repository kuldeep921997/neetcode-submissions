class Solution {
    public int findMin(int[] nums) {

        int n = nums.length;
        int low = 0, high = n-1;
        int mid =- 1;

        while(low <= high){
            // if Sorted.
            mid = low+(high-low)/2;
            int ele = nums[mid];

            if(ele > nums[high]){
                low = mid+1;
            }
            else{
                high = high-1;
            }
        }

        return nums[mid];
        
    }
}
