class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        res=defaultdict(list)
        for s in strs:
            Sorteds=''.join(sorted(s))
            res[Sorteds].append(s)
        return list(res.values())