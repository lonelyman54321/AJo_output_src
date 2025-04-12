/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.cache;

import com.google.common.base.Strings;
import com.google.common.cache.CacheBuilderSpec;
import com.google.common.cache.CacheBuilderSpec$ValueParser;

abstract class CacheBuilderSpec$LongParser
implements CacheBuilderSpec$ValueParser {
    public void parse(CacheBuilderSpec object, String string2, String string3) {
        boolean bl2 = Strings.isNullOrEmpty(string3);
        if (!bl2) {
            long l2;
            try {
                l2 = Long.parseLong(string3);
            }
            catch (NumberFormatException numberFormatException) {
                Object[] objectArray = new Object[]{string2, string3};
                string2 = CacheBuilderSpec.access$000("key %s value set to %s, must be integer", objectArray);
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2, numberFormatException);
                throw illegalArgumentException;
            }
            this.parseLong((CacheBuilderSpec)object, l2);
            return;
        }
        string2 = cP.a("value of key ", string2, " omitted");
        object = new IllegalArgumentException(string2);
        throw object;
    }

    public abstract void parseLong(CacheBuilderSpec var1, long var2);
}

