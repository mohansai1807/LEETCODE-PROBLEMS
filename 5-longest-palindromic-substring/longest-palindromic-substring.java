class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        String result = "";

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                boolean isPalindrome = true;
                int left = i, right = j;

                // check palindrome inline
                while (left < right) {
                    if (s.charAt(left) != s.charAt(right)) {
                        isPalindrome = false;
                        break;
                    }
                    left++;
                    right--;
                }

                if (isPalindrome && (j - i + 1) > result.length()) {
                    result = s.substring(i, j + 1);
                }
            }
        }

        return result;
    }
}