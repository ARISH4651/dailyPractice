class Solution:
    def subsetsWithDup(self, nums: List[int]) -> List[List[int]]:
        res=[]
        nums.sort()
        def solve(i,ans):
            res.append(ans[:])
            for j in range(i,len(nums)):
                if j > i and nums[j]==nums[j-1]:
                    continue
                ans.append(nums[j])
                solve(j+1,ans)
                ans.pop()     
        solve(0,[])
        return res
        