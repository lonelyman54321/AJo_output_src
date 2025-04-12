/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zzfpj {
    private static final zzfpj zza;
    private Context zzb;

    static {
        zzfpj zzfpj2;
        zza = zzfpj2 = new zzfpj();
    }

    private zzfpj() {
    }

    public static zzfpj zzb() {
        return zza;
    }

    public final Context zza() {
        return this.zzb;
    }

    public final void zzc(Context object) {
        object = object != null ? object.getApplicationContext() : null;
        this.zzb = object;
    }
}

