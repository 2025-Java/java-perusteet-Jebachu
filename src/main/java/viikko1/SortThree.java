package viikko1;

import java.util.Arrays;

public class SortThree {
    public static String ascending(int a, int b, int c) {
        int[] arr = {a, b, c};
        Arrays.sort(arr);
        return arr[0] + "," + arr[1] + "," + arr[2];
    }
}
