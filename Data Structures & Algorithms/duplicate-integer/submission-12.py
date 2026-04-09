class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        # need a hash set to store values
        seen = set()

        #loop through the array
        for n in nums:
            if n in seen:
                return True
            seen.add(n)
        return False


        