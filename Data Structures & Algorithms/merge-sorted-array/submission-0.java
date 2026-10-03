class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int left = 0;
        int right = 0;
        int j = 0;
        int[] arr = new int[m+n];
        while(left<m && right<n){
            if(nums1[left]<=nums2[right]){
                arr[j]=nums1[left];
                left++;
            }else{
                arr[j]=nums2[right];
                right++;
            }
            j++;
        }
        while(left<m && j<arr.length){
            arr[j]=nums1[left];
            left++;
            j++;
        }
        while(right<n){
            arr[j]=nums2[right];
            right++;
            j++;
        }
        for(int i=0;i<arr.length;i++){
            nums1[i]=arr[i];
        }
    }
}