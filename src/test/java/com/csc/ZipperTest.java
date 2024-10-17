package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ZipperTest {

  Zipper zipper;
  

  @BeforeEach
  void setUp() {
    zipper = new Zipper();
  }

  @Test
  void itWorks() {
    assertEquals(true, true);
  }

  @Test
  void testMergedNumLists() {
    List<Integer> num1 = List.of(1, 3, 5, 7);
    List<Integer> nums2 = List.of(2, 4, 6, 8);
    List<Integer> expectedNums = List.of(1,2,3,4,5,6,7,8);
    assertEquals(expectedNums, zipper.zip(num1, nums2));
  }

  @Test
  void testMergedDoubleLists() {
    List<Double> num1 = List.of(1.1, 3.3, 5.5, 7.7);
    List<Double> nums2 = List.of(2.2, 4.4, 6.6, 8.8);
    List<Double> expectedNums = List.of(1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8);
    assertEquals(expectedNums, zipper.zip(num1, nums2));
  }

  @Test
  void testSecondNumListBigger() {
    List<Integer> num1 = List.of(1, 3, 5, 7);
    List<Integer> nums2 = List.of(2, 4, 6, 8, 9, 10);
    List<Integer> expectedNums = List.of(1,2,3,4,5,6,7,8,9,10);
    assertEquals(expectedNums, zipper.zip(num1, nums2));
  }

  @Test
  void testFirstNumListBigger() {
    List<Integer> num1 = List.of(1, 3, 5, 7, 9, 10);
    List<Integer> nums2 = List.of(2, 4, 6, 8);
    List<Integer> expectedNums = List.of(1,2,3,4,5,6,7,8,9,10);
    assertEquals(expectedNums, zipper.zip(num1, nums2));
  }

  @Test
  void testListOfString() {
    List<String> colors1 = List.of("Red", "Green", "Blue", "Magenta");
    List<String> colors2 = List.of("White", "Black", "Orange", "Pink");
    List<String> mergedWords = List.of("Red", "White", "Green", "Black", "Blue", "Orange", "Magenta", "Pink");
    assertEquals(mergedWords, zipper.zip(colors1, colors2));
  }

  @Test
  void testBiggerSecondListOfString() {
    List<String> colors1 = List.of("Red", "Green", "Blue");
    List<String> colors2 = List.of("White", "Black", "Orange", "Pink");
    List<String> mergedWords = List.of("Red", "White", "Green", "Black", "Blue", "Orange", "Pink");
    assertEquals(mergedWords, zipper.zip(colors1, colors2));
  }

  @Test
  void testBiggerFirstListOfString() {
    List<String> colors1 = List.of("Red", "Green", "Blue", "Pink");
    List<String> colors2 = List.of("White", "Black", "Orange");
    List<String> mergedWords = List.of("Red", "White", "Green", "Black", "Blue", "Orange", "Pink");
    assertEquals(mergedWords, zipper.zip(colors1, colors2));
  }
}
