class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        Set<Integer> result = new HashSet<>();

        for(int right=0;right<nums.length;right++){
            if(right>k){
                result.remove(nums[right-k-1]);
            }
            if(result.contains(nums[right])){
                return true;
            }
            result.add(nums[right]);
        }
        return false;
    }
}