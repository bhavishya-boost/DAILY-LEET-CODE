class Solution {
    public boolean isValid(String s) {
        int length;
        
        do {
            length = s.length();
            s = s.replace("()", "")
                 .replace("{}", "")
                 .replace("[]", "");
        } while (s.length() < length);
        
        return s.isEmpty();
    }
}