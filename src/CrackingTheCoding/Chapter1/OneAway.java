package CrackingTheCoding.Chapter1;

/**
 * OneAway
 */
public class OneAway {

    public static void main(String[] args) {
        String one = "maps";
        String two = "laps";
        System.out.println(oneEditAway(one, two));
    }

    public static boolean oneEditAway(String first, String second) {
        if (first.length() == second.length()) {
            return oneEditReplace(first, second);
        } else if (first.length() + 1 == second.length()) {
            return oneEditInsert(first, second);
        } else if (first.length() - 1 == second.length()) {
            return oneEditInsert(second, first);
        }
        return false;
    }

    public static boolean oneEditReplace(String one, String two) {
        boolean foundDifference = false;
        for (int i = 0; i < one.length(); i++) {
            if (one.charAt(i) != two.charAt(i)) {
                if (foundDifference) {
                    return false;
                }
                foundDifference = true;
            }
        }
        return true;
    }

    public static boolean oneEditInsert(String one, String two) {
        int index1 = 0, index2 = 0;
        while (index2 < two.length() && index1 < one.length()) {
            if (one.charAt(index1) != two.charAt(index2)) {
                if (index1 != index2) {
                    return false;
                }
                index2++;
            } else {
                index1++;
                index2++;
            }
        }
        return true;
    }
}