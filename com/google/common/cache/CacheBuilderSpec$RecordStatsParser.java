/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.cache;

import com.google.common.base.Preconditions;
import com.google.common.cache.CacheBuilderSpec;
import com.google.common.cache.CacheBuilderSpec$ValueParser;

class CacheBuilderSpec$RecordStatsParser
implements CacheBuilderSpec$ValueParser {
    public void parse(CacheBuilderSpec cacheBuilderSpec, String object, String object2) {
        boolean bl2;
        boolean bl3 = false;
        object = null;
        if (object2 == null) {
            bl2 = true;
        } else {
            bl2 = false;
            object2 = null;
        }
        String string2 = "recordStats does not take values";
        Preconditions.checkArgument(bl2, string2);
        object2 = cacheBuilderSpec.recordStats;
        if (object2 == null) {
            bl3 = true;
        }
        Preconditions.checkArgument(bl3, "recordStats already set");
        cacheBuilderSpec.recordStats = object = Boolean.TRUE;
    }
}

