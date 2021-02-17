/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache license, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the license for the specific language governing permissions and
 * limitations under the license.
 */
package org.apache.logging.log4j.core.appender.rolling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests {@link FileSize}.
 */
public class FileSizeTest {

    private final static long EXPECTED = 10 * 1024;

    @Test
    public void testFileSize() {
        long value = FileSize.parse("10KB", 0);
        assertEquals(EXPECTED, value, "unexpected value " + value);
        value = FileSize.parse("10 KB", 0);
        assertEquals(EXPECTED, value, "unexpected value " + value);
    }
}
