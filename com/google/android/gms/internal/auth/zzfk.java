/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzfg;
import com.google.android.gms.internal.auth.zzfi;
import com.google.android.gms.internal.auth.zzfj;

abstract class zzfk {
    private static final zzfk zza;
    private static final zzfk zzb;

    static {
        zzfk zzfk2 = new zzfg(null);
        zza = zzfk2;
        zzfk2 = new zzfi(null);
        zzb = zzfk2;
    }

    public /* synthetic */ zzfk(zzfj zzfj2) {
    }

    public static zzfk zzc() {
        return zza;
    }

    public static zzfk zzd() {
        return zzb;
    }

    public abstract void zza(Object var1, long var2);

    public abstract void zzb(Object var1, Object var2, long var3);
}

