/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.escape;

import com.google.common.base.Function;

public abstract class Escaper {
    private final Function asFunction;

    public Escaper() {
        sb0_0 sb0_02 = new sb0_0(this);
        this.asFunction = sb0_02;
    }

    public final Function asFunction() {
        return this.asFunction;
    }

    public abstract String escape(String var1);
}

