package Arrays;

/**
 * @author valar_morghulis on 11/02/23.
 * @project Coding-Interview
 * @description
 */
public class Sort012Array {

    public static void main(String[] args) {
        int[] arr = new int[] {0,2, 1, 2, 0};
        sort012(arr,arr.length);
    }

    private static void sort012(int[] arr, int n) {
        int i, cnt0=0, cnt1=0, cnt2=0;
        for (i = 0; i<arr.length; i++){
            if (arr[i] == 0)
                cnt0++;
            if (arr[i] == 1)
                cnt1++;
            if (arr[i] == 2)
                cnt2++;
        }
        i = 0;
        while(cnt0>0){
            arr[i++] = 0;
            cnt0--;
        }
        while(cnt1>0){
            arr[i++] = 1;
            cnt1--;
        }
        while(cnt2>0){
            arr[i++] = 2;
            cnt2--;
        }
        printArr(arr,n);
    }
    static void printArr(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
