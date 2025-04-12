/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzaav;
import com.google.android.gms.internal.ads.zzaaw;
import com.google.android.gms.internal.ads.zzabc;
import com.google.android.gms.internal.ads.zzcu;
import com.google.android.gms.internal.ads.zzdr;
import com.google.android.gms.internal.ads.zzeq;

public final class zzaar {
    private final Context zza;
    private zzdr zzb;
    private zzcu zzc;
    private boolean zzd;

    public zzaar(Context context) {
        this.zza = context = context.getApplicationContext();
    }

    public static /* bridge */ /* synthetic */ Context zza(zzaar zzaar2) {
        return zzaar2.zza;
    }

    public static /* bridge */ /* synthetic */ zzcu zzb(zzaar zzaar2) {
        return zzaar2.zzc;
    }

    public final zzabc zzc() {
        boolean bl2 = this.zzd;
        boolean bl3 = true;
        zzeq.zzf(bl2 ^= bl3);
        Object object = this.zzc;
        if (object == null) {
            object = this.zzb;
            if (object == null) {
                this.zzb = object = new zzaav(null);
            }
            zzdr zzdr2 = this.zzb;
            this.zzc = object = new zzaaw(zzdr2);
        }
        object = new zzabc(this, null);
        this.zzd = bl3;
        return object;
    }
}

