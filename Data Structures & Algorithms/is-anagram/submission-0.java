class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap <Character, Integer> countS = new HashMap<>();
        HashMap <Character, Integer> countT = new HashMap<>();

        int m = s.length();
        int n = t.length();
        if(m != n) return false;

        for(int i = 0 ; i < m; i++){
            countS.put(s.charAt(i),countS.getOrDefault(s.charAt(i),0) + 1);
            countT.put(t.charAt(i),countT.getOrDefault(t.charAt(i),0) + 1);
        }

        return countS.equals(countT);
    }
}
