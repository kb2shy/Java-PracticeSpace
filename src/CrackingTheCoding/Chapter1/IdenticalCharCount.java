package CrackingTheCoding.Chapter1;

/**
 * IdenticalCharCount
 */
public class IdenticalCharCount {

    public static void main(String[] args) {
        String one = "abcd";
        String two = "aba";
        System.out.println(identicalCharCount(one, two));
    }

    public static boolean identicalCharCount(String one, String two) {
        if (one.length() != two.length()) {
            return false;
        }

        int[] letters = new int[128];

        char[] oneArray = one.toCharArray();
        for (char c : oneArray) {
            letters[c]++;
        }

        for (int i = 0; i < two.length(); i++) {
            int c = (int) two.charAt(i);
            letters[c]--;
            if (letters[c] < 0) {
                return false;
            }
        }

        return true;
    }
    
}