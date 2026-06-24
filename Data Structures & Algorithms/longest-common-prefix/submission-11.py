class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:

        result = []

        for i in range(len(strs[0])):
            char = strs[0][i]

            for s in strs[1:]:
                if i >= len(s) or s[i] != char:
                    return "".join(result)
            result.append(char)

        return "".join(result)

        
        
        
        # Brute Force Approach
        # prefix = strs[0]

        # for s in strs[1:]:

        #     while not s.startswith(prefix):
        #         prefix = prefix[0:-1]

        #         if prefix == "": return ""
        # return prefix