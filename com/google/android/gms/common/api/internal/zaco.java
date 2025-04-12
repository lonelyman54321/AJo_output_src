/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.util.concurrent.NumberedThreadFactory;
import com.google.android.gms.internal.base.zaq;
import com.google.android.gms.internal.base.zat;
import java.util.concurrent.ExecutorService;

public final class zaco {
    private static final ExecutorService zaa;

    static {
        zaq zaq2 = zat.zaa();
        NumberedThreadFactory numberedThreadFactory = new NumberedThreadFactory("GAC_Transform");
        zaa = zaq2.zaa(numberedThreadFactory, 1);
    }

    public static ExecutorService zaa() {
        return zaa;
    }
}

