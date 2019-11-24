import java.util.Arrays;

/**
 * ProductOfArray
 */
public class ProductOfArray {

    public static void main(String[] args) {
        int[] test = {1, 2, 3, 4};
        int[] result = productOfIntArray(test);
        System.out.println(Arrays.toString(result));
    }

    public static int[] productOfIntArray(int[] array) {

        if (array.length < 2) {
            return null;
        }

        int[] temp = new int[array.length];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = 1;
        }

        int start = 0, pointer = 0;

        while (start < temp.length) {
            if (start != pointer && pointer < temp.length) {
                temp[start] *= array[pointer++];
            } else {
                pointer = 0;
                start++;
            }
        }

        // for (int i = 0; i < temp.length; i++) {
        //     for (int j = 0; j < temp.length; j++) {
        //         if (j != i) {
        //             temp[i] *= array[j];
        //         }
        //     }
        // }

        return temp;
    }
}