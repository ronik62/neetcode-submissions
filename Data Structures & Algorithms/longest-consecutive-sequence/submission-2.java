class Solution {
    public int longestConsecutive(int[] nums) {
        
        Arrays.sort(nums);

        if(nums.length==0) return 0;
        int count = 1;
        int maxCount = 1;
        
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]==nums[i]+1){
                count++;
                maxCount = Math.max(maxCount, count);
            } else if(nums[i+1] != nums[i]){
                count = 1;
            }
        }

        return maxCount;
    }
}
