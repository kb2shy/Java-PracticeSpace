import java.util.HashSet;
import java.util.Set;

/**
 * LongestSubString
 */
public class LongestSubString {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubString("pwwkew"));
    }

    public static int lengthOfLongestSubString(String s) {

        if (s.length() < 1) {
            return 0;
        }

        if (s.length() == 1) {
            return 1;
        }

        int leftPointer = 0, rightPointer = 0, max = 0;
        Set<Character> set = new HashSet<>();

        while (rightPointer < s.length()) {
            if (!set.contains(s.charAt(rightPointer))) {
                set.add(s.charAt(rightPointer++));
                max = Math.max(max, set.size());
            } else {
                set.remove(s.charAt(leftPointer++));
            }
        }

        return max;

        // String maxWord = "";
        // for (int i = 0; i < s.length() - 1; i++) {
        //     String word = s.substring(i, i + 1);
        //     for (int j = i + 1; j < s.length(); j++) {
        //         if (word.contains(s.substring(j, j + 1))) {
        //             break;
        //         } else {
        //             word += s.substring(j, j + 1);
        //         }
        //     }
        //     if (word.length() > maxWord.length()) {
        //         maxWord = word;
        //     }
        // }

        // return maxWord.length();
    }
}