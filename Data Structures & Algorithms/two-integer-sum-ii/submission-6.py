class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        m={}
        for i,num in enumerate(numbers):
            diff=target-num
            if diff in m:
                return [m[diff],i+1]
            m[num]=i+1
