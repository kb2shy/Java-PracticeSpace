import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * LongestPalindrome
 */
public class LongestPalindrome {

    private static int lo;
    private static int maxLen;

    public static void main(String[] args) {
        // System.out.println(longestPalindrome("babaddtattarrattatddetartrateedredividerb"));
        // System.out.println(longestPalindrome("a"));
        // System.out.println(longestPalindrome("abad"));
        // System.out.println(longestPalindrome("cabbd"));
        // System.out.println(longestPalindrome("dap"));
        System.out.println(longestPalindrome("asecadanadn"));
    }

    public static String longestPalindrome(String s) {

        /*
        Solution from discussion
        */

        int len = s.length();
        if (len < 2) {
            return s;
        }

        for (int i = 0; i < len - 1; i++) {
            extendPalindrome(s, i, i);
            extendPalindrome(s, i, i + 1);
        }

        return s.substring(lo, lo + maxLen);

        // if (s.length() < 1) {
        //     return "";
        // }

        // Set<String> palindromes = new HashSet<>(); 
        // String lp = "";
        // String test = "";
        // for (int i = 0; i < s.length(); i++) {
        //     test = s.substring(0, i + 1);
        //     if (isPalindrome(test) && (test.length() > lp.length())) {
        //         lp = test;
        //         palindromes.add(test);
        //         System.out.println(test);
        //     }
        // }

        // for (int i = 1; i < s.length(); i++) {
        //     test = s.substring(i, s.length());
        //     if (isPalindrome(test)&& (test.length() > lp.length())) {
        //         lp = test;
        //         palindromes.add(test);
        //         System.out.println(test);
        //     }
        // }

        // for (int i = s.length() - 1; i > s.length() / 2; i--) {
        //     for (int j = 0; j < s.length() / 2; j++) {
        //         test = s.substring(j, i);
        //         if (isPalindrome(test)&& (test.length() > lp.length())) {
        //             lp = test;
        //             palindromes.add(test);
        //         }
        //     }
        // }

        // for (int i = 0; i < s.length() / 2; i++) {
        //     for (int j = s.length(); j > s.length() / 2; j--) {
        //         test = s.substring(i, j);
        //         if (isPalindrome(test)&& (test.length() > lp.length())) {
        //             lp = test;
        //             palindromes.add(test);
        //         }
        //     }
        // }

        // String lp = "";
        // for (String string : palindromes) {
        //     if (string.length() > lp.length()) {
        //         lp = string;
        //     }
        // }

        // return lp;
    }

    // public static boolean isPalindrome(String s) {
    //     char[] chars = s.toCharArray();
    //     Stack<Character> characters = new Stack<>();
    //     for (char x : chars) {
    //         characters.add(x);
    //     }

    //     for (int i = 0; i < chars.length; i++) {
    //         if (characters.peek() == chars[i]) {
    //             characters.pop();
    //         } else {
    //             return false;
    //         }
    //     }
        
    //     return characters.isEmpty() || characters.size() == 1;
    // }

    public static void extendPalindrome(String s, int j, int k) {
        while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
            j--;
            k++;
        }
        if (maxLen < k - j - 1) {
            lo = j + 1;
            maxLen = k - j - 1;
        }
    }
}