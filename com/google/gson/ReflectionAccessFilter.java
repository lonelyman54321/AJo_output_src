/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson;

import com.google.gson.ReflectionAccessFilter$1;
import com.google.gson.ReflectionAccessFilter$2;
import com.google.gson.ReflectionAccessFilter$3;
import com.google.gson.ReflectionAccessFilter$4;
import com.google.gson.ReflectionAccessFilter$FilterResult;

public interface ReflectionAccessFilter {
    public static final ReflectionAccessFilter BLOCK_ALL_ANDROID;
    public static final ReflectionAccessFilter BLOCK_ALL_JAVA;
    public static final ReflectionAccessFilter BLOCK_ALL_PLATFORM;
    public static final ReflectionAccessFilter BLOCK_INACCESSIBLE_JAVA;

    static {
        ReflectionAccessFilter reflectionAccessFilter = new ReflectionAccessFilter$1();
        BLOCK_INACCESSIBLE_JAVA = reflectionAccessFilter;
        reflectionAccessFilter = new ReflectionAccessFilter$2();
        BLOCK_ALL_JAVA = reflectionAccessFilter;
        reflectionAccessFilter = new ReflectionAccessFilter$3();
        BLOCK_ALL_ANDROID = reflectionAccessFilter;
        reflectionAccessFilter = new ReflectionAccessFilter$4();
        BLOCK_ALL_PLATFORM = reflectionAccessFilter;
    }

    public ReflectionAccessFilter$FilterResult check(Class var1);
}

