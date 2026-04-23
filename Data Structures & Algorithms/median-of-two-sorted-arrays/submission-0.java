class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int [] arr= new int[nums1.length + nums2.length];
        int n = arr.length;
        int filled = 0;
        for (int i = 0; i < nums1.length; i++) {
            arr[filled++] = nums1[i];
}

for (int i = 0; i < nums2.length; i++) {
    arr[filled++] = nums2[i];
}

Arrays.sort(arr);

double res;

if (n % 2 != 0) {
    res = (double) arr[n / 2];
} else {
    res = (arr[(n / 2) - 1] + arr[n / 2]) / 2.0;
}

return res;
        
        
    }
}
