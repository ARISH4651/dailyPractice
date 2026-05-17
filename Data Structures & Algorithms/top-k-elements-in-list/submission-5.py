class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        map={}
        for num in nums:
            map[num]=1+map.get(num,0)
        res=[]
        for i in range(k):
            maxfreq=0
            ele=0
            for key in map:
               if map[key]>maxfreq:
                maxfreq=map[key]
                ele=key
            res.append(ele)
            del map[ele]
        return res