class Solution:
    def combinationSum2(self, candidates: List[int], target: int) -> List[List[int]]:
        res=[]
        candidates.sort()
        def solve(i,target,ans):
            if target==0:
                res.append(ans.copy())
                return
            for j in range(i,len(candidates)):
                if j>i and candidates[j]==candidates[j-1]:
                    continue
                if candidates[j]>target:
                    break
                ans.append(candidates[j])
                solve(j+1,target-candidates[j],ans)
                ans.pop()
        solve(0,target,[])
        return res
