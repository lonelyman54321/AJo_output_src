/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.util;

import java.io.Closeable;

public final class CommonFlow$watch$2
implements Closeable {
    final /* synthetic */ g00_0 $job;

    public CommonFlow$watch$2(g00_0 g00_02) {
        this.$job = g00_02;
    }

    public void close() {
        this.$job.d(null);
    }
}

