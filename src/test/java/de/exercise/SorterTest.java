package de.exercise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SorterTest {

  @Test
  public void addElement() {
    int[] array = {45, 12, 77, 50, 26, 89, 2, 35, 67, 98, 14, 29, 53, 71, 6, 33, 85, 19, 42, 90};
    int[] expected = {2, 6, 12, 14, 19, 26, 29, 33, 35, 42, 45, 50, 53, 67, 71, 77, 85, 89, 90, 98};

    int[] result = Sorter.sort(array);
    Assertions.assertArrayEquals(expected, result);
  }
}
