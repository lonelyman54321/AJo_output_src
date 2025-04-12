/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson;

import com.google.gson.ReflectionAccessFilter;
import com.google.gson.ReflectionAccessFilter$FilterResult;
import com.google.gson.internal.ReflectionAccessFilterHelper;

class ReflectionAccessFilter$2
implements ReflectionAccessFilter {
    public ReflectionAccessFilter$FilterResult check(Class object) {
        boolean bl2 = ReflectionAccessFilterHelper.isJavaType(object);
        object = bl2 ? ReflectionAccessFilter$FilterResult.BLOCK_ALL : ReflectionAccessFilter$FilterResult.INDECISIVE;
        return object;
    }
}

