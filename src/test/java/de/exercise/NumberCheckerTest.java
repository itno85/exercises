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

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;

public class NumberCheckerTest {

  @Test
  public void isEven() {
    NumberChecker numberChecker = new NumberChecker();
    Assertions.assertTrue(numberChecker.isEven(42));
    Assertions.assertFalse(numberChecker.isEven(55));
    Assertions.assertTrue(numberChecker.isEven(16));
    Assertions.assertFalse(numberChecker.isEven(163));
    Assertions.assertTrue(numberChecker.isEven(1634));
  }

  @Test
  public void isOdd() {
    NumberChecker numberChecker = new NumberChecker();
    Assertions.assertTrue(numberChecker.isOdd(1));
    Assertions.assertFalse(numberChecker.isOdd(2));
    Assertions.assertTrue(numberChecker.isOdd(3));
    Assertions.assertFalse(numberChecker.isOdd(456));
    Assertions.assertTrue(numberChecker.isOdd(4567));
  }

  @Test
  public void getMax() {
    NumberChecker numberChecker = new NumberChecker();
    Assertions.assertEquals(8, numberChecker.getMax(5, 8));
    Assertions.assertEquals(9, numberChecker.getMax(9, 6));
    Assertions.assertEquals(7, numberChecker.getMax(7, 7));

    Assertions.assertEquals(16, numberChecker.getMax(16, 5, 8));
    Assertions.assertEquals(32, numberChecker.getMax(8, 32, 5));
    Assertions.assertEquals(64, numberChecker.getMax(7, 7, 64));
  }

  @Test
  public void getSign() {
    NumberChecker numberChecker = new NumberChecker();
    Assertions.assertEquals(NumberSign.positive, numberChecker.getSign(123));
    Assertions.assertEquals(NumberSign.negative, numberChecker.getSign(-234));
    Assertions.assertEquals(NumberSign.zero, numberChecker.getSign(0));
  }

  @Test
  public void getWeek() {
    NumberChecker numberChecker = new NumberChecker();
    Assertions.assertEquals(DayOfWeek.MONDAY, numberChecker.getWeek(1));
    Assertions.assertEquals(DayOfWeek.TUESDAY, numberChecker.getWeek(2));
    Assertions.assertEquals(DayOfWeek.WEDNESDAY, numberChecker.getWeek(3));
    Assertions.assertEquals(DayOfWeek.THURSDAY, numberChecker.getWeek(4));
    Assertions.assertEquals(DayOfWeek.FRIDAY, numberChecker.getWeek(5));
    Assertions.assertEquals(DayOfWeek.SATURDAY, numberChecker.getWeek(6));
    Assertions.assertEquals(DayOfWeek.SUNDAY, numberChecker.getWeek(7));
    Assertions.assertNull(numberChecker.getWeek(0));
    Assertions.assertNull(numberChecker.getWeek(8));
  }
}
