class Solution:
    def findDuplicate(self, nums: List[int]) -> int:
        hm=Counter(nums)
        for key,value in hm.items():
            if value>1:
                return key
        
        