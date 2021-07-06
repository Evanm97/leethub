class Solution {
    public int lengthOfLastWord(String s) {
        
        if(s.isEmpty() || s.trim().isEmpty()) {
            return 0;
        } 
        
        else {
            String[] words = s.split(" ");
            String last = words[words.length-1];
            return last.length();
        }
    }
}