package Arrays;

import java.util.Arrays;

/**
 * @author valar_morghulis on 13/02/23.
 * @project Coding-Interview
 * @description Cyclic rotate an array k times
 */
public class CyclicRotateKTimes {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int k = 500;
        Arrays.stream(reverseK(arr, k)).forEach(a -> System.out.print(a + " "));
    }

    private static int[] reverseK(int[] arr, int k) {
        int n = arr.length;
        k = k%n;
        reverse(arr, 0, n-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
        return arr;
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start<end) {
            int temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
    }
}
