class Solution {
    public int[] sortArray(int[] nums) {
         //bubble sort
       for(int i=0;i<nums.length;i++)
       {
        boolean flag=false;
        for(int j=0;j<nums.length-i-1;j++)
        {
            if(nums[j]>nums[j+1])
            {
                int temp=nums[j];
                nums[j]=nums[j+1];
                nums[j+1]=temp;
                flag=true;
            }
        }
        if(flag==false)break;
       }
       return nums;
    }
}