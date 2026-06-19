# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def rightSideView(self, root: Optional[TreeNode]) -> List[int]:

        queue = [root]
        right_side_view_temp = []

        if not root : return right_side_view_temp

        while queue:
            level_size = len(queue)
            level_vals = []

            for _ in range(level_size):

                node = queue.pop(0)
                level_vals.append(node.val)

                if node.left: queue.append(node.left)
                if node.right: queue.append(node.right)

            right_side_view_temp.append(level_vals)

        right_side_view = []
        
        for ele in right_side_view_temp:
            if ele: right_side_view.append(ele[len(ele)-1])

        return right_side_view