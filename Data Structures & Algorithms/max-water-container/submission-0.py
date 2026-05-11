class Solution:
    def maxArea(self, heights: List[int]) -> int:
        res = 0
        #loops to go through all the lines to make pairs
        for i in range(len(heights)):
            for j in range(i + 1, len(heights)):
                res = max(res, min(heights[i], heights[j]) * (j-i))
        return res
        