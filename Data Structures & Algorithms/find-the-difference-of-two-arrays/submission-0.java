class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        Set<Integer> set = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();


        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i])){
                set.remove(nums2[i]);
            }
        }
        for(int i=0;i<nums2.length;i++){
            set2.add(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++){
            if(set2.contains(nums1[i])){
                set2.remove(nums1[i]);
            }
        }

        List<List<Integer>> res = new ArrayList<>();

        res.add(new ArrayList<>(set));
        res.add(new ArrayList<>(set2));

        return res;

    }
}