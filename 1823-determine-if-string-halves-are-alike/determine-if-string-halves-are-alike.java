class Solution {
    public boolean halvesAreAlike(String s) {
        String temp = s.toLowerCase();
        int n = s.length();
        int mid = n / 2;

        String v1 = temp.substring(0, mid);
        String v2 = temp.substring(mid);

        String vowels = "aeiou";
        int count1 = 0, count2 = 0;

        // Count vowels in first half
        for (char c : v1.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count1++;
            }
        }

        // Count vowels in second half
        for (char c : v2.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count2++;
            }
        }

        return count1 == count2;
    }
}