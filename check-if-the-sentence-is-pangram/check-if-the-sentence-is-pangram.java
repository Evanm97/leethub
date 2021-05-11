class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length() < 26) {
            return false;
        }
        
        boolean pangram = false;
        ArrayList<Character> array = new ArrayList<Character>();
        int count = 0;

       for(int i = 0; i<sentence.length(); i++){
           if(!array.contains(sentence.charAt(i))) {
               array.add(sentence.charAt(i));
               count ++;
           }
           
       }
    return pangram = count > 25;
    }
}