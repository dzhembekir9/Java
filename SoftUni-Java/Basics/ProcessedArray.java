package Basics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ProcessedArray {
    public static void main(String[] args) {

        int[] nums = new int[] { 1, 2, 3, 4, 4, 5, 6 };

        List<Integer> arrList = Arrays.stream(nums).boxed().collect(Collectors.toList());

        Collections.reverse(arrList);

        System.out.println("Reverse:");
        for (int item : arrList) {
            System.out.println(item + " ");
        }

        int[] distinct = Arrays.stream(nums).distinct().toArray();

        System.out.println("Distinct");
        for (int item : distinct) {
            System.out.println(item + "");
        }

    }
}
