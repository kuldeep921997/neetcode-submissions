class Solution {
    public boolean isPalindrome(String s) {
        String newStr = s.replaceAll(" ", "").replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int n = newStr.length(), start = 0, end = n-1;

        while(start<=end)
            if(newStr.charAt(start++) != newStr.charAt(end--)) return false;
        return true;
    }
}
