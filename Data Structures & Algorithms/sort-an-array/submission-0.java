class Solution {
    public int[] sortArray(int[] nums) {
         int minidx=0;
        for(int i=0;i<nums.length-1;i++)
        {
            minidx=i;
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[minidx]>nums[j])minidx=j;
            }
            if(minidx!=i)
            {
                int temp=nums[i];
                nums[i]=nums[minidx];
                nums[minidx]=temp;
            }
        }
        return nums;
    }
}