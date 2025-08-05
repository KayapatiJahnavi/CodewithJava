class Solution {
    public boolean isPalinSent(String s) {
        StringBuilder cleaned = new StringBuilder();

        // Clean the string: remove non-alphanumerics, convert to lowercase
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleaned.append(Character.toLowerCase(c));
            }
        }

        // Check if cleaned string is a palindrome
        String cleanedStr = cleaned.toString();
        String reversedStr = cleaned.reverse().toString();

        return cleanedStr.equals(reversedStr);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.isPalinSent("A man, a plan, a canal: Panama")); // true
        System.out.println(sol.isPalinSent("race a car"));                     // false
        System.out.println(sol.isPalinSent("No lemon, no melon"));             // true
    }
}
