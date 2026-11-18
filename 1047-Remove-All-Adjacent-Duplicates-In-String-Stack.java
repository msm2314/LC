import java.util.Stack;

class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> sk = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (!sk.isEmpty() && sk.peek() == c) {
                sk.pop();
            } else {
                sk.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!sk.isEmpty()) {
            sb.append(sk.pop());
        }
        return sb.reverse().toString();
    }
}
