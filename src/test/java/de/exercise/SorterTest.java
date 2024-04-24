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

public class SorterTest {

  @Test
  public void addElement() {
    int[] array = {45, 12, 77, 50, 26, 89, 2, 35, 67, 98, 14, 29, 53, 71, 6, 33, 85, 19, 42, 90};
    int[] expected = {2, 6, 12, 14, 19, 26, 29, 33, 35, 42, 45, 50, 53, 67, 71, 77, 85, 89, 90, 98};

    int[] result = Sorter.sort(array);
    Assertions.assertArrayEquals(expected, result);
  }
}
