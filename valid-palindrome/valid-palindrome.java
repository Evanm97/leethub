class Solution {
    public boolean isPalindrome(String s) {

        String string = new String();
        ArrayList<String> list=new ArrayList<String>();

        s = s.toUpperCase();
        s = s.replaceAll("\\P{Alnum}", "");

        for (int i=0; i<s.length(); i++) {
            string = "" + s.charAt(i);

            list.add(string);
        }

        boolean palindrome = true;
        int j = list.size()-1;

            for (String value : list) {
                if (value.equals(list.get(j))) {
                    j = j - 1;
                } else {
                    palindrome = false;
                }
            }

        return palindrome;
    }
}
