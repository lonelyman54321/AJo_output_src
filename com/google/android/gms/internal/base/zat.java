/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.base;

import com.google.android.gms.internal.base.zaq;
import com.google.android.gms.internal.base.zas;

public final class zat {
    private static final zaq zaa;
    private static volatile zaq zab;

    static {
        zas zas2 = new zas(null);
        zaa = zas2;
        zab = zas2;
    }

    public static zaq zaa() {
        return zab;
    }
}

