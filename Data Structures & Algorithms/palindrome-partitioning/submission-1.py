class Solution:
    def partition(self, s: str) -> List[List[str]]:
        res=[]
        def solve(i,ans):
            if i==len(s):
                res.append(ans.copy())
                return
            for j in range(i,len(s)):
                if issafe(s[i:j+1]):
                    ans.append(s[i:j+1])
                    solve(j+1,ans)
                    ans.pop() 
        def issafe(s):
            if s==s[::-1]:
                return True
            else:
                return False
        solve(0,[])
        return res
        