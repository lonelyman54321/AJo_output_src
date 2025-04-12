/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.google.android.gms.internal.gtm.zzhv;
import com.google.android.gms.internal.gtm.zzpy;
import com.google.android.gms.internal.gtm.zzqh;
import com.google.android.gms.tagmanager.zzcb;
import com.google.android.gms.tagmanager.zzck;

public final class zzhw {
    private final Context zza;
    private final String zzb;
    private final zzck zzc;
    private final zzcb zzd;

    public zzhw(Context context, zzck zzck2, zzcb zzcb2, String string2) {
        this.zza = context = context.getApplicationContext();
        this.zzc = zzck2;
        this.zzd = zzcb2;
        this.zzb = string2;
    }

    public final zzhv zza(zzpy zzpy2, zzqh zzqh2) {
        zzck zzck2 = this.zzc;
        zzcb zzcb2 = this.zzd;
        Context context = this.zza;
        String string2 = this.zzb;
        zzhv zzhv2 = new zzhv(context, string2, zzpy2, zzqh2, zzck2, zzcb2);
        return zzhv2;
    }
}

