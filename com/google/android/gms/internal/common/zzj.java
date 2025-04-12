/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.common;

import com.google.android.gms.internal.common.zzk;

public class zzj {
    private final Class zza;
    private final Object zzb;

    private zzj(Class clazz, Object object) {
        this.zza = clazz;
        this.zzb = object;
    }

    public /* synthetic */ zzj(Class clazz, Object object, zzk zzk2) {
        this(clazz, object);
    }

    public static zzj zzb(Class clazz, Object object) {
        zzj zzj2 = new zzj(clazz, object);
        return zzj2;
    }

    public final Class zzc() {
        return this.zza;
    }

    public final Object zzd() {
        return this.zzb;
    }
}

