/*
 * Decompiled with CFR 0.152.
 */
package com.bumptech.glide.load.engine;

import java.util.concurrent.Executor;

public final class EngineJob$b {
    public final zk2_0 a;
    public final Executor b;

    public EngineJob$b(zk2_0 zk2_02, Executor executor) {
        this.a = zk2_02;
        this.b = executor;
    }

    public final boolean equals(Object object) {
        boolean bl2 = object instanceof EngineJob$b;
        if (bl2) {
            object = (EngineJob$b)object;
            zk2_0 zk2_02 = this.a;
            object = ((EngineJob$b)object).a;
            return zk2_02.equals(object);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

