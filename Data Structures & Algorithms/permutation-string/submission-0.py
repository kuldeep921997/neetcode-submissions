class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        window_len = len(s1)
        s2_len = len(s2)
        s1_dict = {}
        s2_dict = {}
        left = 0
        right = 0
        
        for ele in s1:
            s1_dict[ele] = s1_dict.get(ele, 0) + 1

        while right < s2_len:
            ele = s2[right]
            s2_dict[ele] = s2_dict.get(ele, 0) + 1

            if right - left + 1 > window_len:
                left_char = s2[left]
                s2_dict[left_char] -= 1
                if s2_dict[left_char] == 0:
                    del s2_dict[left_char]
                left += 1

            if s1_dict == s2_dict:
                return True

            right += 1

        return False