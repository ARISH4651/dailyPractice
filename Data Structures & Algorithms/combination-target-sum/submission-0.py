class Solution:
    def combinationSum(self, nums: List[int], target: int) -> List[List[int]]:
        res=[]
        def solve(i,target,ans):
            if i>=len(nums):
                if target==0:
                    res.append(ans.copy())
                return 
            if nums[i]<=target:
                ans.append(nums[i])
                solve(i,target-nums[i],ans)
                ans.pop()
            solve(i+1,target,ans)
        solve(0,target,[])
        return res