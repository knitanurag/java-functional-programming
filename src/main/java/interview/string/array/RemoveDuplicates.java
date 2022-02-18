package interview.string.array;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        removeDuplicatesFromSortedArray();
    }

    private static void removeDuplicatesFromSortedArray() {
        int[] duplicateSortedAr = {1,3,7,8,8,9,14,16,16,17,17};
        Arrays.stream(duplicateSortedAr).distinct().forEach(System.out::println);
    }
}
