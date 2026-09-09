class Solution {
    public boolean isPalindrome(String s) {
        
        String trimmedString = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

        int left = 0;
        int right = trimmedString.length()-1;
        while(left<right){
            if(trimmedString.charAt(left) == trimmedString.charAt(right)){
                left++;
                right--;
            }else{
                return false;
            }
        }
        return true;
    }
}
