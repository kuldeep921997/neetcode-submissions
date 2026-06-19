class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int high = 0;
        
        for(int i = 0; i<n; i++){
            high = Math.max(high, piles[i]);
        }

        int low = 1;
        int res = Integer.MAX_VALUE;

        while(low<=high){
            int mid = low+(high-low)/2;

            int total_rounds = 0;
            for(int i = 0; i< n; i++){
                total_rounds+= (piles[i] + mid -1)/mid;
            }
            if(total_rounds>h){
                low = mid+1;
            }else{
                high = mid-1;
                res = Math.min(res, mid);
            }
        }

        return res;
    }
}
