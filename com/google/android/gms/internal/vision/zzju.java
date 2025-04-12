/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzjw;
import com.google.android.gms.internal.vision.zzjx;
import com.google.android.gms.internal.vision.zzjz;
import java.util.List;

abstract class zzju {
    private static final zzju zza;
    private static final zzju zzb;

    static {
        zzju zzju2 = new zzjw(null);
        zza = zzju2;
        zzju2 = new zzjz(null);
        zzb = zzju2;
    }

    private zzju() {
    }

    public /* synthetic */ zzju(zzjx zzjx2) {
        this();
    }

    public static zzju zza() {
        return zza;
    }

    public static zzju zzb() {
        return zzb;
    }

    public abstract List zza(Object var1, long var2);

    public abstract void zza(Object var1, Object var2, long var3);

    public abstract void zzb(Object var1, long var2);
}

