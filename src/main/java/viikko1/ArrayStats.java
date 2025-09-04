package viikko1;

public class ArrayStats {
    public static double average(int[] arr) {
        if (arr.length == 0) return 0.0;
        long sum = 0;
        for (int n : arr) sum += n;
        return (double) sum / arr.length;
    }

    public static int max(int[] arr) {
        if (arr.length == 0) return Integer.MIN_VALUE;
        int maxVal = arr[0];
        for (int n : arr) {
            if (n > maxVal) maxVal = n;
        }
        return maxVal;
    }
}