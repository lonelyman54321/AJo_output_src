/*
 * Decompiled with CFR 0.152.
 */
package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.engine.DecodeJob$e;

public final class f$c
implements DecodeJob$e {
    public final Mq0$a a;
    public volatile Mq0 b;

    public f$c(uj1_0 uj1_02) {
        this.a = uj1_02;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Mq0 a() {
        Object object = this.b;
        if (object != null) return this.b;
        synchronized (this) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        object = this.b;
                        if (object != null) break block3;
                        object = this.a;
                        this.b = object = object.build();
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                if ((object = this.b) != null) return this.b;
                this.b = object = new Object();
                return this.b;
            }
            throw throwable2;
        }
    }
}

