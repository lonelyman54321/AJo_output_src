/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.zabe;
import com.google.android.gms.common.api.internal.zabw;
import java.lang.ref.WeakReference;

final class zabd
extends zabw {
    private final WeakReference zaa;

    public zabd(zabe zabe2) {
        WeakReference<zabe> weakReference;
        this.zaa = weakReference = new WeakReference<zabe>(zabe2);
    }

    public final void zaa() {
        zabe zabe2 = (zabe)this.zaa.get();
        if (zabe2 == null) {
            return;
        }
        zabe.zai(zabe2);
    }
}

