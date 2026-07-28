class Solution {
    public String smallestPalindrome(String s) {
        int[] freq = new int[26];

        // Count frequency of each character
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        StringBuilder firstHalf = new StringBuilder();
        StringBuilder middle = new StringBuilder();

        // Build the first half and find the middle character (if any)
        for (int i = 0; i < 26; i++) {
            while (freq[i] >= 2) {
                firstHalf.append((char) (i + 'a'));
                freq[i] -= 2;
            }

            if (freq[i] == 1) {
                middle.append((char) (i + 'a'));
            }
        }

        String secondHalf = new StringBuilder(firstHalf).reverse().toString();

        return firstHalf.toString() + middle.toString() + secondHalf;
    }
}