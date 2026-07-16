class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        res=0
        for i in range(len(s)):
            m={}
            maxf=0
            for j in range(i,len(s)):
                m[s[j]]=1+m.get(s[j],0)
                maxf=max(maxf,m[s[j]])
                if (j-i+1)-maxf<=k:
                    res=max(res,j-i+1)
        return res

            

        