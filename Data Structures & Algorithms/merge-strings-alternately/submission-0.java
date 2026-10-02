class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        String result = "";
        int left = 0;
        int right = 0;
        while(left<word1.length() && right<word2.length()){
            result = result + word1.charAt(left) + word2.charAt(right);
            left++;
            right++;
        }
        if(word1.length()>word2.length()){
           while(left<word1.length()){
            result = result + word1.charAt(left);
            left++;
           }
        }
        if(word2.length()>word1.length()){
            while(right<word2.length()){
                result = result + word2.charAt(right);
                right++;
            }
        }
        return result;
    }
}