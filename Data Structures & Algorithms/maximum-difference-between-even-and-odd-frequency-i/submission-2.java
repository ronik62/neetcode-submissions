class Solution {
    public int maxDifference(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

        int evenDiff = Integer.MAX_VALUE;
        int oddDiff = 0;
        for(Map.Entry<Character,Integer>entry:map.entrySet()){
            char key = entry.getKey();
            int value = entry.getValue();
            if(value%2 == 0 && value<=evenDiff){
                evenDiff=value;
            }else if(value%2 !=0 && value>oddDiff){
                oddDiff = value;
            }
        }
        return oddDiff-evenDiff;
    }
}