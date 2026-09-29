class Solution {
    public boolean isValid(String s) {
        List<Character> stack = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '{' || c == '[') {
                stack.add(c);
            } else {
                if (stack.size() == 0) return false;

                char top = stack.get(stack.size() - 1);

                if (c == ')' && top != '(') return false;
                if (c == '}' && top != '{') return false;
                if (c == ']' && top != '[') return false;

                stack.remove(stack.size() - 1);
            }
        }

        return stack.size() == 0;
    }
}