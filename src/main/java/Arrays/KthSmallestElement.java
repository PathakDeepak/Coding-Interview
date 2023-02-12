package Arrays;

/**
 * @author valar_morghulis on 11/02/23.
 * @project Coding-Interview
 * @description Given an array arr[] and an integer K where K is smaller than size of array,
 *              the task is to find the Kth smallest element in the given array.
 *              It is given that all array elements are distinct.
 */
public class KthSmallestElement {

    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5};
        int k = 3;

        int kthSmallestElementValue = kthSmallest(arr, 0, arr.length-1, k);
        System.out.println(kthSmallestElementValue);
    }

    private static int kthSmallest(int[] arr, int low, int high, int k) {
        int partition = partition(arr, low, high);
        if (partition == k-1)
            return arr[partition];
        else if (partition < k-1) {
            return kthSmallest(arr,partition+1,high,k);
        }
        else
            return kthSmallest(arr,low,partition-1,k);
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int pivotloc = low;
        for (int i = low; i<=high; i++){
            if (arr[i] < pivot){
                pivotloc++;
            }
        }
        int temp = arr[high];
        arr[high] = arr[pivotloc];
        arr[pivotloc] = temp;
        return pivotloc;
    }
}
