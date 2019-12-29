import java.util.regex.Pattern;

class StringToInteger {
    public static void main(String[] args) {
        System.out.println(myAtoi("5564"));
        System.out.println(myAtoi("     -92"));
        System.out.println(myAtoi("words and 583"));
        System.out.println(myAtoi("+"));
        System.out.println(myAtoi("+2-2"));
        System.out.println(myAtoi("+22-33"));
        System.out.println(myAtoi("     -1 123"));
        System.out.println(myAtoi("20000000000000000000"));
        System.out.println(myAtoi("5-1"));
    }

    public static int myAtoi(String str) {
        
        char[] strArray = str.trim().toCharArray();
        
        String regex = "\\d";
        String newNumberString = "";
        for (int i = 0; i < strArray.length; i++) {
            if (Pattern.matches(regex, Character.toString(strArray[i])) || 
                strArray[i] == '+' || 
                strArray[i] == '-') {
                if ((strArray[i] == '-' || 
                     strArray[i] == '+') && 
                     (newNumberString.startsWith("-") || 
                      newNumberString.startsWith("+") ||
                      newNumberString.length() > 0)) {
                    break;
                } else {
                    newNumberString += strArray[i];
                } 
            } else if (strArray[i] == ' ' && newNumberString.length() == 0) {
                continue;
            } else {
                break;
            }
        }

        return newNumberString.length() != 0 ? checkInt(newNumberString) : 0;
    }

    private static int checkInt(String numStr) {
        if (numStr.equals("+") || numStr.equals("-")) {
            return 0;
        // } else if ((numStr.length() > 11 && numStr.startsWith("-")) || Long.parseLong(numStr) < Integer.MIN_VALUE) {
        //     return Integer.MIN_VALUE;
        // } else if (numStr.length() > 10 && Long.parseLong(numStr) > Integer.MAX_VALUE) {
        //     return Integer.MAX_VALUE;
        }
        try {
            return Integer.parseInt(numStr);
        } catch (NumberFormatException e) {
            if (numStr.startsWith("-")) {
                return Integer.MIN_VALUE;
            } else {
                return Integer.MAX_VALUE;
            }
        }
    }
}
