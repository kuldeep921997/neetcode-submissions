class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // create a new HashMap to map the frequencies with number.
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        // Create a list to incorporate each element as list/ArrayList.
        List<Integer> [] freq = new List[n+1];

        // Assigning the ArrayList to each of the element of the freq List.
        for(int i=0; i< freq.length; i++){
            freq[i] = new ArrayList<>();
        }

        // Map the numbers with there Frequencies in map.
        for(int ele : nums ){
            map.put(ele, map.getOrDefault(ele, 0)+1);
        }

        // put the numbers in the freq Array
        // such that the index itself is the frequency and the value at that index is the ArrayList 
        // containing all the elements with the same frequency.

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            freq[entry.getValue()].add(entry.getKey());
        }

        // initiate a res array, and an index variable to keep the match of k.
        int [] res = new int [k];
        int index = 0;

        // return total k values and then break automatically
        for(int i = freq.length-1; i>0; i--){
            for(int p : freq[i]){
                res[index++] = p;
                if(index == k) return res;
            }
        }
        return res;
    }
}
