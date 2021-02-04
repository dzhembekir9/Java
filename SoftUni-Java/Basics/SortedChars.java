package Basics;

import java.util.Arrays;

public class SortedChars {
    public static void main(String[] args) {
        char[] chars = { 'b', 'a', 'c', 'd', 'e', 'f' };

        Arrays.sort(chars);

        for (char ch : chars) {
            System.out.println(ch + " ");
        }
    }
}
