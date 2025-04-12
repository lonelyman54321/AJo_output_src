/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.cache;

import com.google.common.base.Preconditions;
import com.google.common.cache.CacheBuilderSpec;
import com.google.common.cache.CacheBuilderSpec$ValueParser;
import com.google.common.cache.LocalCache$Strength;

class CacheBuilderSpec$KeyStrengthParser
implements CacheBuilderSpec$ValueParser {
    private final LocalCache$Strength strength;

    public CacheBuilderSpec$KeyStrengthParser(LocalCache$Strength localCache$Strength) {
        this.strength = localCache$Strength;
    }

    public void parse(CacheBuilderSpec cacheBuilderSpec, String object, String object2) {
        boolean bl2;
        boolean bl3 = false;
        if (object2 == null) {
            bl2 = true;
        } else {
            bl2 = false;
            object2 = null;
        }
        String string2 = "key %s does not take values";
        Preconditions.checkArgument(bl2, string2, object);
        object2 = cacheBuilderSpec.keyStrength;
        if (object2 == null) {
            bl3 = true;
        }
        Preconditions.checkArgument(bl3, "%s was already set to %s", object, object2);
        object = this.strength;
        cacheBuilderSpec.keyStrength = object;
    }
}

