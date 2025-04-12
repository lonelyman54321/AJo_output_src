/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.cache;

import com.google.common.base.Preconditions;
import com.google.common.cache.CacheBuilderSpec;
import com.google.common.cache.CacheBuilderSpec$LongParser;

class CacheBuilderSpec$MaximumSizeParser
extends CacheBuilderSpec$LongParser {
    public void parseLong(CacheBuilderSpec cacheBuilderSpec, long l2) {
        Long l3;
        Long l4 = cacheBuilderSpec.maximumSize;
        boolean bl2 = false;
        boolean bl3 = l4 == null;
        String string2 = "maximum size was already set to %s";
        Preconditions.checkArgument(bl3, string2, (Object)l4);
        l4 = cacheBuilderSpec.maximumWeight;
        if (l4 == null) {
            bl2 = true;
        }
        Preconditions.checkArgument(bl2, "maximum weight was already set to %s", (Object)l4);
        cacheBuilderSpec.maximumSize = l3 = Long.valueOf(l2);
    }
}

