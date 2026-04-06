class Solution {
    public int majorityElement(int[] nums) {
        int max=0;
        int maxkey=0;
        HashMap<Integer, Integer>map=new HashMap<>();
        for(int num:nums)
        map.put(num, map.getOrDefault(num,0)+1);

    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
    if (entry.getValue() > max) {
        max = entry.getValue();
        maxkey = entry.getKey();
    }
    }
        return maxkey;
        
    }
}