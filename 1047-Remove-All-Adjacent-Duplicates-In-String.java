class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sk = new StringBuilder();
        for (char i : s.toCharArray()) {
            int n = sk.length();
            if (n > 0 && sk.charAt(n - 1) == i) {
                sk.deleteCharAt(n - 1);
            } else {
                sk.append(i);
            }
        }
        return sk.toString();
    }
}
