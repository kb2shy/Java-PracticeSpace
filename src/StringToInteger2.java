/**
 * StringToInteger2
 */
public class StringToInteger2 {

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
        // Solution one from discussion
        // str = str.trim();
        // if (str.isEmpty()) {
        //     return 0;
        // }

        // int sign = 1, i = 0;
        // if (str.charAt(0) =='-' || str.charAt(0) == '+') {
        //     sign = (str.charAt(0) == '-' ? -1 : 1);
        //     if (str.length() < 2 || !Character.isDigit(str.charAt(1))) {
        //         return 0;
        //     }

        //     i++;
        // }

        // int n = 0;
        // while (i < str.length()) {
        //     if (Character.isDigit(str.charAt(i))) {
        //         int d = str.charAt(i) - '0';
        //         if (n > (Integer.MAX_VALUE - d) / 10) {
        //             n = (sign == -1) ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        //             return n;
        //         }
        //         n = n*10 + d;
        //     } else {
        //         break;
        //     }
        //     i++;
        // }
        // return sign * n;

        // Solution two from discussion
        int sign = 1, iterator = 0, result = 0;
        str = str.trim();
        if (str.isEmpty()) return 0;
        else if (str.charAt(iterator) == '-') { iterator++; sign = -1;}
        else if (str.charAt(iterator) == '+') { iterator++; }
        while (iterator < str.length() && Character.isDigit(str.charAt(iterator))) {
            int digits = str.charAt(iterator) - '0';
            if (result > (Integer.MAX_VALUE - digits) / 10) return sign > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            result = result * 10 + digits;
            iterator++;
        }
        return result * sign;
    }
}