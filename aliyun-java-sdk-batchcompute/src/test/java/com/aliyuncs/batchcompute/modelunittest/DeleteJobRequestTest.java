/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.aliyuncs.batchcompute.modelunittest;

import com.aliyuncs.batchcompute.model.v20150630.DeleteJobRequest;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by guangchun.luo on 15/5/6.
 */
public class DeleteJobRequestTest extends TestCase {

    @Test
    public void testConstructor() {

        String RESOURCE_ID = "xx000111";
        DeleteJobRequest req = new DeleteJobRequest(RESOURCE_ID);

        assertEquals(req.getJobId(), RESOURCE_ID);
    }

    @Test
    public void testSetJobId() {

        String RESOURCE_ID = "xx000111";
        DeleteJobRequest req = new DeleteJobRequest();
        req.setJobId(RESOURCE_ID);
        assertEquals(req.getJobId(), RESOURCE_ID);
    }
}
