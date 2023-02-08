import java.util.Arrays;
import java.util.HashMap;

/**
 * @author valar_morghulis on 06/02/23.
 * @project Coding-Interview
 * @description
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[] {10,2,7,9,1}, 9)));
    }

    private static int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];

        for (int i=0; i<numbers.length; i++){
            if (map.containsKey(numbers[i])) {
                int index = map.get(numbers[i]);
                result[0] = index;
                result[1] = i;
                break;
            }
            map.put(target - numbers[i], i);
        }
        return result;
    }
}
