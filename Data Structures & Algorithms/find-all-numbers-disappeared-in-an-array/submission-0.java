class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        
        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> newList = new ArrayList<>();
        
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int i=1;i<=nums.length;i++){
            if(!set.contains(i)){
                newList.add(i);
            }
        }
        return newList;
    }
}