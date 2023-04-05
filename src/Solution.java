class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() <= 1) return s.length();
        int index = 0;
        String substr = "";
        String temp = "";
        while (index < s.length() - 1) {
            for (int i = index; i < s.length(); i++) {
                if (isUnique(substr, s.charAt(i))) substr += s.charAt(i);
                else {
                    index++;
                    if (temp.length() < substr.length()) temp = substr;
                    substr = "";
                    break;
                }
            }
        }
        System.out.println(temp);
        return temp.length();
    }
    public boolean isUnique(String s, char c){
        for (int i = 0; i < s.length(); i++)
            if (c == s.charAt(i)) return false;
        return true;

    }
}