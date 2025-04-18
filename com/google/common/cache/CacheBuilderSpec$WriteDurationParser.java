/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.cache;

import com.google.common.base.Preconditions;
import com.google.common.cache.CacheBuilderSpec;
import com.google.common.cache.CacheBuilderSpec$DurationParser;
import java.util.concurrent.TimeUnit;

class CacheBuilderSpec$WriteDurationParser
extends CacheBuilderSpec$DurationParser {
    public void parseDuration(CacheBuilderSpec cacheBuilderSpec, long l2, TimeUnit timeUnit) {
        boolean bl2;
        TimeUnit timeUnit2 = cacheBuilderSpec.writeExpirationTimeUnit;
        if (timeUnit2 == null) {
            bl2 = true;
        } else {
            bl2 = false;
            timeUnit2 = null;
        }
        Preconditions.checkArgument(bl2, "expireAfterWrite already set");
        cacheBuilderSpec.writeExpirationDuration = l2;
        cacheBuilderSpec.writeExpirationTimeUnit = timeUnit;
    }
}

