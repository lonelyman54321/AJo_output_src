/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.cache;

import com.google.common.base.Preconditions;
import com.google.common.cache.CacheBuilderSpec;
import com.google.common.cache.CacheBuilderSpec$IntegerParser;

class CacheBuilderSpec$ConcurrencyLevelParser
extends CacheBuilderSpec$IntegerParser {
    public void parseInteger(CacheBuilderSpec cacheBuilderSpec, int n3) {
        Integer n4;
        Integer n7 = cacheBuilderSpec.concurrencyLevel;
        boolean bl2 = n7 == null;
        Preconditions.checkArgument(bl2, "concurrency level was already set to %s", (Object)n7);
        cacheBuilderSpec.concurrencyLevel = n4 = Integer.valueOf(n3);
    }
}

