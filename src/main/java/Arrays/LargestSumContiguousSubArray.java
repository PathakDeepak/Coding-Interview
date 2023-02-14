package Arrays;

/**
 * @author valar_morghulis on 13/02/23.
 * @project Coding-Interview
 * @description: Given an array Arr[] of N integers.
 *               Find the contiguous sub-array(containing at least one number)
 *               which has the maximum sum and return its sum.
 */
public class LargestSumContiguousSubArray {
    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};

        System.out.println(largestSum(arr));
    }

    private static int largestSum(int[] arr) {
        int bestSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i=0; i<arr.length; i++) {
            currentSum = Math.max(arr[i],currentSum+arr[i]);
            bestSum = Math.max(bestSum,currentSum);
        }
        return bestSum;
    }
}
