/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 */
package com.google.android.gms.ads.internal.util;

import android.graphics.Bitmap;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public final class zzby {
    final Map zza;
    private final AtomicInteger zzb;

    public zzby() {
        Serializable serializable;
        this.zza = serializable = new Serializable();
        super(0);
        this.zzb = serializable;
    }

    public final Bitmap zza(Integer n3) {
        return (Bitmap)this.zza.get(n3);
    }
}

