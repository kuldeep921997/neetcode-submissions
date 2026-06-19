# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def lowestCommonAncestor(self, root: TreeNode, p: TreeNode, q: TreeNode) -> TreeNode:

        node = root
        p_val = p.val
        q_val = q.val

        while node:
            if p_val < node.val and q_val < node.val:
                node = node.left
            
            elif p_val > node.val and q_val > node.val:
                node = node.right

            else: return node
        
        return None