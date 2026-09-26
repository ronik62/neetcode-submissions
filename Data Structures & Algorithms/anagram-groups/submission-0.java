class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        

        HashMap<String,List<String>> map = new HashMap<>();

        for(int i=0;i<strs.length;i++){
            String current = strs[i];
            char[] chars = current.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            
            map.putIfAbsent(sorted,new ArrayList<>());

            map.get(sorted).add(current);
        }

        return new ArrayList<>(map.values());
    }
}
