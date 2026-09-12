class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        m = Counter(s)
        n = Counter(t)
        return m == n