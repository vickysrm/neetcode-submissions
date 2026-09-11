class Solution:
    def divideArray(self, nums: List[int]) -> bool:
        m=Counter(nums)
        for key,value in m.items():
            if value%2!=0:
                return False
        return True
        