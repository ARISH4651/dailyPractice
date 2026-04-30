class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        int res=0;
        for(int num:nums) set.add(num);
        for(int num:nums)
        {
            int curr = num, count=0;
            while(set.contains(curr))
            {
                count++;
                curr++;
            }
            res=Math.max(res,count);
        }
        return res;
    }
}
