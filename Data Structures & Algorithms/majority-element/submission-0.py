class Solution:
    def majorityElement(self, nums: List[int]) -> int:

        curr = nums[0]
        count = 1

        for ele in nums[1:]:
            if count == 0:
                curr = ele

            if ele == curr:
                count+=1
            else:
                count-=1

        return curr

        