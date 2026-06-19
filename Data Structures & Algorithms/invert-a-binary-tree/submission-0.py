# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def invertTree(self, root: Optional[TreeNode]) -> Optional[TreeNode]:

        if not root: return root

        root_node = root

        node_list = [root]

        while node_list:
            node = node_list.pop()
            
            if node and node.left: node_list.append(node.left)
            if node and node.right: node_list.append(node.right)

            node.left, node.right = node.right, node.left
        
        return root
