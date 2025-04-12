/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.base;

import com.google.common.base.CommonPattern;

interface PatternCompiler {
    public CommonPattern compile(String var1);

    public boolean isPcreLike();
}

