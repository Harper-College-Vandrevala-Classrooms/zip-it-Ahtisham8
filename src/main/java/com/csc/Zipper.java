package com.csc;

import java.util.ArrayList;
import java.util.List;

public class Zipper {

    public static <T> List<T> zip(List<T> first, List<T> second)
    {
        List<T> output = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < first.size() || j < second.size()) {
            if (i < first.size()) {
                output.add(first.get(i));
                i++;
            }

            if (j < second.size()) {
                output.add(second.get(j));
                j++;
            }

            
        }

        return output;
    }

    public static void main(String[] args) {
        List<Integer> nums1 = List.of(1, 3, 5, 7);
        List<Integer> nums2 = List.of(2, 4, 6, 8, 9, 10, 11);
        List<Integer> mergedNumbers = zip(nums1, nums2);
        System.out.println(mergedNumbers);

        List<String> colors1 = List.of("Red", "Green", "Blue");
        List<String> colors2 = List.of("White", "Black", "Orange", "Pink");
        List<String> mergedWords = zip(colors1, colors2);
        System.out.println(mergedWords); // [Red, White, Green, Black, Blue, Orange, Pink]
    }

}
