/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.assetpacks.internal;

import java.io.Closeable;
import java.io.InputStream;

public abstract class an
implements Closeable {
    public abstract long a();

    public abstract InputStream b(long var1, long var3);

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final InputStream c() {
        synchronized (this) {
            long l2 = this.a();
            long l3 = 0L;
            return this.b(l3, l2);
        }
    }
}

