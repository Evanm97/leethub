class Solution {
    public String toLowerCase(String str) {
        
		String result = "";

        for (int i = 0; i<str.length(); i++) {
			char c = str.charAt(i);
			
            if (c >= 65 && c<= 90) {
				int n = c + 32;
				c = (char) n;
			}
            result = result + c;
		}
        return result;
    }
}