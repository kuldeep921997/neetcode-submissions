class Solution {
    // Can't use the method (Naive Approach) 
    // that multiply and then divide the result 
    // with the current value as if the current 
    // value is 0 then it will be a ArithmeticException 
    // divide by 0 ERROR.

    // First approach shows the same issue
    // public int[] productExceptSelf(int[] nums) {

    //     int prod = 1;
    //     // List<Integer> res = new ArrayList<>(); NOT GOOD BABY.
    //     int len = nums.length;
    //     int [] res = new int[len];
    //     for(int n: nums){
    //         prod *= n;
    //     }
    //     int i = 0;
    //     for(int n: nums){
    //         res[i++] = prod/n;
    //     }

    //     return res;   
    // }

    // Below is the correct approach or rather 
    // should be said that optimal approach 
    // as we are asked not to use divide.
    // used the prefix and postfix approach.
    // and mutated the same array twice.
    // To Avoid the extra space for prefix and Postfix.
    // Arrays.
    // Beautiful Approach 69.

    public int[] productExceptSelf(int[] nums) {

        int n = nums.length, pre = 1,post = 1;
        int [] res = new int [n];

        res[0] = 1;
        
        for(int i = 1; i< n; i++){
            pre *= nums[i-1];
            res[i] = pre;
        }

        for(int j = n-2; j>=0;j--){
            post *= nums[j+1];
            res[j]*= post;
        }
        return res;
    }
}  
