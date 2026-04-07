class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        if(piles.length>h){
            return 0;
        }
        int l=1, r=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            r=Math.max(r,piles[i]);
        }
        int ans=0;
        while(l<=r){
            int mid=l+(r-l)/2;
            int timeTaken=0;
            for(int i=0;i<piles.length;i++){
                timeTaken+=Math.ceil(((double)piles[i]/mid));
            }
            if(timeTaken>h){
                l=mid+1;
            }else{
                ans=mid;
                r=mid-1;
            }
        }
        return ans;
    }
}
