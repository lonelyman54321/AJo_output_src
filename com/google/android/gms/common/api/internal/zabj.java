/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.util.concurrent.NumberedThreadFactory;
import com.google.android.gms.internal.base.zaq;
import com.google.android.gms.internal.base.zat;
import java.util.concurrent.ExecutorService;

public final class zabj {
    private static final ExecutorService zaa;

    static {
        zaq zaq2 = zat.zaa();
        NumberedThreadFactory numberedThreadFactory = new NumberedThreadFactory("GAC_Executor");
        int n3 = 2;
        zaa = zaq2.zac(n3, numberedThreadFactory, n3);
    }

    public static ExecutorService zaa() {
        return zaa;
    }
}

