import java.util.Stack;

/**
 * IsPalindrome
 */
public class IsPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("abcba"));
    }

    public static boolean isPalindrome(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> characters = new Stack<>();
        for (char x : chars) {
            characters.add(x);
        }

        for (int i = 0; i < chars.length; i++) {
            if (characters.peek() == chars[i]) {
                characters.pop();
            } else {
                return false;
            }
        }
        
        return characters.isEmpty() || characters.size() == 1;
    }
}