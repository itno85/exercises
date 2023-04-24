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
  public void getBiggestNumber() {
    NumberChecker numberChecker = new NumberChecker();
    Assertions.assertTrue(numberChecker.isOdd(1));
    Assertions.assertFalse(numberChecker.isOdd(2));
    Assertions.assertTrue(numberChecker.isOdd(3));
    Assertions.assertFalse(numberChecker.isOdd(456));
    Assertions.assertTrue(numberChecker.isOdd(4567));
  }
}
