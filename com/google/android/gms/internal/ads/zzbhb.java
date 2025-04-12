/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbgz;
import com.google.android.gms.internal.ads.zzbha;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class zzbhb {
    static final AtomicBoolean zza;
    private static final AtomicReference zzb;
    private static final AtomicReference zzc;

    static {
        Serializable serializable;
        zzb = serializable = new Serializable();
        zzc = serializable = new Serializable();
        serializable = new Serializable();
        zza = serializable;
    }

    public static zzbgz zza() {
        return (zzbgz)zzb.get();
    }

    public static zzbha zzb() {
        return (zzbha)zzc.get();
    }

    public static void zzc(zzbgz zzbgz2) {
        zzb.set(zzbgz2);
    }
}

