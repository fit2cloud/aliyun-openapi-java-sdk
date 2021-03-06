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
package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;
import com.aliyuncs.ecs.model.v20140526.DescribeTagsResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeTagsResponse.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTagsResponseUnmarshaller {

	public static DescribeTagsResponse unmarshall(DescribeTagsResponse describeTagsResponse, UnmarshallerContext context) {
		
		describeTagsResponse.setRequestId(context.stringValue("DescribeTagsResponse.RequestId"));
		describeTagsResponse.setNextToken(context.stringValue("DescribeTagsResponse.NextToken"));

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < context.lengthValue("DescribeTagsResponse.Tags.Length"); i++) {
			Tag  tag = new Tag();
			tag.setTagKey(context.stringValue("DescribeTagsResponse.Tags["+ i +"].TagKey"));
			tag.setTagValue(context.stringValue("DescribeTagsResponse.Tags["+ i +"].TagValue"));

			tags.add(tag);
		}
		describeTagsResponse.setTags(tags);
	 
	 	return describeTagsResponse;
	}
}