class Solution {

    public String encode(List<String> strs) {

        StringBuilder sb = new StringBuilder();
        for(String str:strs){
            sb.append(str.length());
            sb.append("#");
            sb.append(str);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {

        
        
        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {
            // Find the delimiter
            int delimiter = str.indexOf('#', i);

            // Extract and parse the length
            int length = Integer.parseInt(str.substring(i, delimiter));

            // Find where the actual string begins
            int start = delimiter + 1;

            // Extract the original string
            String st = str.substring(start, start + length);
            result.add(st);

            // Move to the next encoded string
            i = start + length;
        }

        return result;
    
    }
}
