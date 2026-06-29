class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:

        len1 = len(word1)
        len2 = len(word2)
        res = []

        i = 0
        j = 0

        if not word1 or not word2: 
            if word1: return word1
            else: return word2

        while i<len(word1) and j<len(word2):
            res.append(word1[i])
            res.append(word2[j])
            i+=1
            j+=1
        
        if i<len1: res.append(word1[i:])
        if j<len2: res.append(word2[j:])

        return "".join(res)
        