package Arrays;

import java.util.Arrays;

/**
 * @author valar_morghulis on 12/02/23.
 * @project Coding-Interview
 * @description Move all negative numbers to beginning and positive to end with constant extra space
 */
public class MovePositiveNegative {

    public static void main(String[] args) {
        int[] arr = new int[] {1, -1, 0,8,5,-3,-2,6};
        int[] result = move(arr);
        Arrays.stream(result).forEach(a -> System.out.print(a + " " ));
    }

    private static int[] move(int[] arr) {
        int left = 0;
        int right = arr.length-1;

        while (left < right) {
            if (arr[left] < 0 && arr[right] < 0)
                left++;
            else if (arr[left] > 0 && arr[right] > 0) {
                right--;
            } else if (arr[left] >= 0 && arr[right] < 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            else {
                left++;
                right--;
            }
        }
        return arr;
    }
}
