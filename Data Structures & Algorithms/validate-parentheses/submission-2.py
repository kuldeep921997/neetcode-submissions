class Solution:
    def isValid(self, s: str) -> bool:

        stack = []

        for ele in s:
            if len(stack) > 0:
                stack_top = stack[-1]
            else:
                stack_top = ""

            if ele in ["(", "{", "["]:
                stack.append(ele)
            elif ele in [")", "}", "]"]:
                if ele == ")" and stack_top == "(":
                    stack.pop()
                elif ele == "}" and stack_top == "{":
                    stack.pop()
                elif ele == "]" and stack_top == "[":
                    stack.pop()
                else:
                    stack.append(ele)

        return len(stack) == 0

        







