package CrackingTheCoding.Chapter1;

/**
 * Unique
 */
public class Unique {

    public static void main(String[] args) {
        String str = "abc";
        System.out.println(str.charAt(0));
        // System.out.println(isUniqueChars("aba"));
    }

    public static boolean isUniqueChars(String str) {
        if (str.length() > 128) {
            return false;
        }

        boolean[] char_set = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (char_set[val]) {
                return false;
            }
            char_set[val] = true;
        }
        return true;
    }

}