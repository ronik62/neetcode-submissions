class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        String first = strs[0];
        String result = "";

        for(int i=0;i<first.length();i++){
            for(int j=1;j<strs.length;j++){

                if(i>= strs[j].length() || first.charAt(i) != strs[j].charAt(i)){
                    return result;
                }
            }
            result += first.charAt(i);
        }

        return result;
    }
}