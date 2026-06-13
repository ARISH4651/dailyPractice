class Solution:
    def solveNQueens(self, n: int) -> List[List[str]]:
        res=[]
        board= ["."*n for _ in range(n)]
        leftrow=[0]*n
        lowerdiagonal=[0]*(2*n-1)
        upperdiagonal=[0]*(2*n-1)
        def solve(i):
            if i==n:
                res.append(board[:])
                return
            for j in range(n):
                if leftrow[j]==0 and lowerdiagonal[j+i]==0 and upperdiagonal[n-1+j-i]==0:
                    board[j]=board[j][:i]+"Q"+board[j][i+1:]
                    leftrow[j]=1
                    lowerdiagonal[j+i]=1
                    upperdiagonal[n-1+j-i]=1
                    solve(i+1)
                    board[j]=board[j][:i]+"."+board[j][i+1:]
                    leftrow[j]=0
                    lowerdiagonal[j+i]=0
                    upperdiagonal[n-1+j-i]=0
        solve(0)
        return res




