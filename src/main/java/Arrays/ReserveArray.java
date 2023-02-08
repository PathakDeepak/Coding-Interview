package Arrays;

import java.util.Arrays;

/**
 * @author valar_morghulis on 08/02/23.
 * @project Coding-Interview
 * @description
 */
public class ReserveArray {

    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4};
        System.out.println(Arrays.toString(reverseArray(arr,0,arr.length-1)));

    }

    static int[] reverseArray(int[] arr, int start, int end) {
        while (start <= end){
            int temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
        return arr;
    }
}
