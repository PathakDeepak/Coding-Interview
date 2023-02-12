package Arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * @author valar_morghulis on 12/02/23.
 * @project Coding-Interview
 * @description: Given two sorted arrays, find their union and intersection.
 */
public class UnionAndIntersection {
    public static void main(String[] args) {
        int[] arr1 = {1,1,1,2,2,3,3,3};
        int[] arr2 = {3,3,3,4};
        System.out.println("Union of two arrays: " + union(arr1, arr2));
        System.out.println("Intersection of two arrays: " + intersection(arr1, arr2));
    }

    private static List<Integer> union(int[] arr1, int[] arr2) {
        List<Integer> result = new ArrayList<>();
        int a1 = 0;
        int a2 = 0;

        while (a1<arr1.length || a2<arr2.length) {

            //check and skip duplicate
            while (a1>0 && a1<arr1.length && arr1[a1] == arr1[a1 - 1])
                a1++;
            while (a2>0 && a2<arr2.length && arr2[a2] == arr2[a2 - 1])
                a2++;

            //check if any list exhausted
            if (a1 >= arr1.length) {
                result.add(arr2[a2]);
                a2++;
                continue;
            }
            if (a2 >= arr2.length) {
                result.add(arr1[a1]);
                a1++;
                continue;
            }

            //compare two arrays and place smaller two result if not equal
            if (arr1[a1]<arr2[a2]){
                result.add(arr1[a1]);
                a1++;
            } else if (arr1[a1]>arr2[a2]){
                result.add(arr2[a2]);
                a2++;
            } else {
                result.add(arr1[a1]);
                a1++;
                a2++;
            }

        }

        return result;
    }

    private static List<Integer> intersection(int[] arr1, int[] arr2) {
        List<Integer> result = new ArrayList<>();
        int a1=0, a2=0;
        while (a1<arr1.length && a2< arr2.length) {
            //check duplicate
            while (a1>0 && a1< arr1.length && arr1[a1] == arr1[a1-1])
                a1++;
            while (a2>0 && a2< arr2.length && arr2[a2] == arr2[a2-1])
                a2++;

            //check if one of array exhaust
            if (a1>=arr1.length || a2>=arr2.length)
                break;

            //compare two array and select common element
            if (arr1[a1]<arr2[a2])
                a1++;
            else if (arr1[a1]>arr2[a2]) {
                a2++;
            }
            else{
                result.add(arr1[a1]);
                a1++;
                a2++;
            }
        }
        return result;
    }
}
