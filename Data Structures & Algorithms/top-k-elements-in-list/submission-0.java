class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        List<Integer> [] freq = new List[n+1];

        for(int i=0; i< freq.length; i++){
            freq[i] = new ArrayList<>();
        }

        for(int ele : nums ){
            map.put(ele, map.getOrDefault(ele, 0)+1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            freq[entry.getValue()].add(entry.getKey());
        }

        int [] res = new int [k];
        int index = 0;

        for(int i = freq.length-1; i>0; i--){
            for(int p : freq[i]){
                res[index++] = p;
                if(index == k) return res;
            }
        }
        return res;
    }
}
