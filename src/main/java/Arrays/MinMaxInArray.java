package Arrays;

/**
 * @author valar_morghulis on 08/02/23.
 * @project Coding-Interview
 * @description
 */
public class MinMaxInArray {

    public static void main(String[] args) {
        int[] arr = new int[]{5,4,3,2,1};
        Values values = new Values();
        minMax(arr,values);
        System.out.println("min value: " + values.getMin());
        System.out.println("max value: " + values.getMax());
    }

    static void minMax (int[] arr, Values minMaxValues) {
        if (arr.length == 1){
            minMaxValues.setMin(arr[0]);
            minMaxValues.setMax(arr[0]);
        }
        if (arr.length == 2){
            if (arr[0] < arr[1])
            {
                minMaxValues.setMin(arr[0]);
                minMaxValues.setMax(arr[1]);
            }
            else{
                minMaxValues.setMin(arr[1]);
                minMaxValues.setMax(arr[0]);
            }
        }
        if (arr.length > 2){
            int min = arr[0];
            int max = arr[1];
            if(min>max){
                min = min+max;
                max = min-max;
                min = min-max;
            }
            for (int i = 2; i < arr.length; i++){
                if (arr[i] < min)
                    min = arr[i];
                else if (arr[i] > max)
                    max = arr[i];
            }
            minMaxValues.setMin(min);
            minMaxValues.setMax(max);
        }

    }



    static class Values {
        int min;
        int max;

        public int getMin() {
            return min;
        }

        public void setMin(int min) {
            this.min = min;
        }

        public int getMax() {
            return max;
        }

        public void setMax(int max) {
            this.max = max;
        }
    }
}
