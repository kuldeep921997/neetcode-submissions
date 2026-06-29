class Solution:
    def isPalindrome(self, s: str) -> bool:

        i = 0
        s_updates = re.sub(r'[^a-zA-Z0-9]', '', s)
        j = len(s_updates)-1

        while i<=j:
            if s_updates[i].lower() != s_updates[j].lower(): return False
            i+=1
            j-=1

        return True
        