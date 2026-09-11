class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        m=Counter(nums)
        for key,value in m.items():
            if value>len(nums)/2:
                return key
        