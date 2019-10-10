/*
 * Copyright 2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amplifyframework.storage.options;

/**
 * Enum to specify the return type for storage get invocation.
 */
public enum StorageGetDestination {
    
    /**
     * Obtain data in memory.
     */
    DATA,

    /**
     * Write to local file.
     */
    FILE,

    /**
     * Obtain pre-signed download URL that expires.
     */
    URL;
}