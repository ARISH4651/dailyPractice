class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxArea=Integer.MIN_VALUE;
        for(int i=0;i<heights.length;i++){
            int curheight=heights[i];
            int r=i+1;
            while(r<heights.length && heights[r]>=curheight){
                r++;
            }
            int l=i;
            while(l>=0 && heights[l]>=curheight){
                l--;
            }
            r--;
            l++;
            maxArea=Math.max(maxArea,curheight*(r-l+1));
        }
        return maxArea;
    }
}
