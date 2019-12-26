/**
 * LongestPalindrome
 */
public class LongestPalindrome {

    private static int lo;
    private static int maxLen;

    public static void main(String[] args) {
        System.out.println(longestPalindrome("babaddtattarrattatddetartrateedredividerb"));
        System.out.println(longestPalindrome("a"));
        System.out.println(longestPalindrome("abad"));
        System.out.println(longestPalindrome("cabbd"));
        System.out.println(longestPalindrome("dap"));
        System.out.println(longestPalindrome("asecadanadn"));
    }

    public static String longestPalindrome(String s) {

        int len = s.length();
        if (len < 2) {
            return s;
        }

        for (int i = 0; i < len - 1; i++) {
            makePalindrome(s, i, i);
            makePalindrome(s, i, i + 1);
        }

        return s.substring(lo, lo + maxLen);
    }

    public static void makePalindrome(String s, int leftIndex, int rightIndex) {
        while (leftIndex >= 0 && rightIndex < s.length() && s.charAt(leftIndex) == s.charAt(rightIndex)) {
            leftIndex--;
            rightIndex++;
        }
        if (maxLen < rightIndex - leftIndex - 1) {
            lo = leftIndex + 1;
            maxLen = rightIndex - leftIndex - 1;
        }
    }
}