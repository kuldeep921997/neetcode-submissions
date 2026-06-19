class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        len1 = len(s)
        l = 0
        r = 0
        char_count = {}
        maxLen = 0 
        max_freq = 0

        while r < len1:
            # char is identified
            char = s[r]
            
            # char is added in the dict
            char_count[char] = char_count.get(char, 0) + 1
            
            # get the max freq, as we are counting it in just every step.
            # we know that we have to compare it with the most recent addition

            max_freq = max(max_freq, char_count[char])

            # Get the window length
            window_len = r-l+1

            # Check if the window is valid.
            # If window_len -  max_freq <= k then Valid
            # If window_len -  max_freq <= k then Invalid

            # if invalid shrink the window from left.
            # Reduce the count from maxLen

            if window_len - max_freq > k:
                left_char = s[l]
                char_count[left_char] -=1
                l+=1

            maxLen = max(maxLen, r-l+1)
            r = r+1

        return maxLen
        