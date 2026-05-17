class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        HashMap<Integer,List<Integer>>reverseMap=new HashMap<>();
         for(int n:map.keySet()){
            int count= map.get(n);
            reverseMap.putIfAbsent(count, new ArrayList<Integer>());
            reverseMap.get(count).add(n);
         }
         int res[]=new int[k];
         int index=0;
         for(int i=nums.length;i>=1;i--){
            if(reverseMap.containsKey(i)){
                for (int n:reverseMap.get(i)){
                    if(index<k){
                        res[index++]=n;
                    }
                }
            }
            if(index>=k) break;
         }
         return res;
    }
    
}
