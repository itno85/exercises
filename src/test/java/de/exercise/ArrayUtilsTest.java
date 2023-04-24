/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package de.exercise;

import de.exercise.ArrayUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class ArrayUtilsTest {

  @Test
  public void addElement() {
    int[] array = {0, 1, 2, 3, 4, 5};
    int[] expected = {0, 1, 2, 3, 4, 5, 32};

    int[] result = ArrayUtils.addElement(array, 32);
    Assertions.assertArrayEquals(expected, result);
  }

  @Test
  public void addElementAt() {
    int[] array = {0, 1, 2, 3, 4, 5};
    int[] expected = {32, 0, 1, 2, 3, 4, 5};

    int[] result = ArrayUtils.addElementAt(array, 0, 32);
    Assertions.assertArrayEquals(expected, result);

    int[] expected2 = {0, 1, 32, 2, 3, 4, 5};

    int[] result2 = ArrayUtils.addElementAt(array, 2, 32);
    Assertions.assertArrayEquals(expected2, result2);
  }

  @Test
  public void removeLastElement() {
    int[] array = {0, 1, 2, 3, 4, 5};
    int[] expected = {0, 1, 2, 3, 4};

    int[] result = ArrayUtils.removeLastElement(array);
    Assertions.assertArrayEquals(expected, result);
  }

  @Test
  public void swapArray() {
    int[] array = {0, 1, 2, 3, 4, 5};
    int[] expected = {5, 4, 3, 2, 1, 0};

    int[] result = ArrayUtils.swapArray(array);
    Assertions.assertArrayEquals(expected, result);
  }

  @Test
  public void createSortedArray() {
    int[] result = ArrayUtils.createSortedArray(10);
    int[] expected = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    Assertions.assertArrayEquals(expected, result);
  }

  @Test
  public void createRandomArray() {
    int[] result1 = ArrayUtils.createRandomArray(100);
    int[] result2 = ArrayUtils.createRandomArray(100);
    Assertions.assertNotEquals(result1, result2);
  }

  @Test
  public void average() {
    int[] array = {23, 79, 42};
    BigDecimal result = ArrayUtils.average(array);
    BigDecimal expected = new BigDecimal("48");
    Assertions.assertEquals(expected, result);
  }

  @Test
  public void sumEvenNumbers() {
    int[] array = {23, 79, 42, 44};
    BigDecimal result = ArrayUtils.sumEvenNumbers(array);
    int expected = 86;

    Assertions.assertEquals(expected, result);
  }

  @Test
  public void sumOddNumbers() {
    int[] array = {23, 79, 42, 44};
    BigDecimal result = ArrayUtils.sumOddNumbers(array);
    int expected = 102;

    Assertions.assertEquals(expected, result);
  }

  @Test
  public void hurtz() {
    int[] hurtzArray = {23, 79, 256, 42, 44};
    int[] noHurtzArray = {23, 79, 123, 42, 44};
    Assertions.assertEquals("hurtz!", ArrayUtils.hurtz(hurtzArray));
    Assertions.assertEquals("no hurtz...", ArrayUtils.hurtz(noHurtzArray));
  }
}
