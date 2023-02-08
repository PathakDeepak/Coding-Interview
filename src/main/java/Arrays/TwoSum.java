package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;

/**
 * @author valar_morghulis on 06/02/23.
 * @project Coding-Interview
 * @description Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *              Example:
 *                  Given nums = [2, 7, 11, 15], target = 9,
 *                  Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1].
 *
 */

public class TwoSum {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{10,2,7,9,1}, 9)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];

        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(numbers[i])) {
                int index = map.get(numbers[i]);
                result[0] = index;
                result[1] = i;
                break;
            }
            else {
                map.put(target - numbers[i], i);
            }
        }

        return result;
    }
}
