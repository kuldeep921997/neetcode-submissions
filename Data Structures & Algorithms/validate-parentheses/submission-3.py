class Solution:
    def isValid(self, s: str) -> bool:

        stack = []
        closing_to_opening = {')':'(', '}':'{', ']':'['}

        for char in s:
            if char in ["(", "{", "["]: stack.append(char)
            else:
                if not stack or stack[-1] != closing_to_opening[char]:
                    return False
                stack.pop()

        return len(stack) == 0
