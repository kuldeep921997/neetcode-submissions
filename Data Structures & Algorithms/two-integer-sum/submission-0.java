class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap <Integer, Integer> map = new HashMap <> ();
        int n = nums.length;
        List <Integer>[] list = new List [2];

        for(int i = 0; i < n; i++){
            int compliment = target-nums[i];
            
            if(map.get(compliment) != null){
                return new int[]{map.get(compliment), i};
            }
            map.put(nums[i], i);

        }

        return new int []{};
        
    }
}
