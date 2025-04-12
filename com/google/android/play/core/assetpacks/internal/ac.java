/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.assetpacks.internal;

import com.google.android.play.core.assetpacks.internal.ab;
import java.util.concurrent.atomic.AtomicReference;

public final class ac {
    private static final AtomicReference a;

    static {
        AtomicReference<Object> atomicReference;
        a = atomicReference = new AtomicReference<Object>(null);
    }

    public static ab a() {
        return (ab)a.get();
    }
}

