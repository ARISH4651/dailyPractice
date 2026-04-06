class Solution {
    public int[] getConcatenation(int[] nums) {
        int[]arr=new int[2*nums.length];
        int j=0, i=0;
        while(i<2)
        {
            for(int num:nums)
            {
                arr[j++]=num;
            }
            i++;
        }
        return arr;
        
    }
}