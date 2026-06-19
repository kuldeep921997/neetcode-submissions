# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def goodNodes(self, root: TreeNode) -> int:

        def dfs_good_nodes(node, max_so_far):

            if not node: return 0

            count = 1 if node.val >= max_so_far else 0
            max_so_far = max(max_so_far, node.val)

            count += dfs_good_nodes(node.left, max_so_far)
            count += dfs_good_nodes(node.right, max_so_far)

            return count

        return dfs_good_nodes(root, root.val)
        