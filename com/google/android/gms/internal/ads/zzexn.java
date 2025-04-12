/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzcjj;
import com.google.android.gms.internal.ads.zzcjo;
import com.google.android.gms.internal.ads.zzcjv;
import com.google.android.gms.internal.ads.zzexl;
import com.google.android.gms.internal.ads.zzgge;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhkx;
import com.google.android.gms.internal.ads.zzhlg;

public final class zzexn
implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;
    private final zzhlg zzc;
    private final zzhlg zzd;

    public zzexn(zzhlg zzhlg2, zzhlg zzhlg3, zzhlg zzhlg4, zzhlg zzhlg5) {
        this.zza = zzhlg2;
        this.zzb = zzhlg3;
        this.zzc = zzhlg4;
        this.zzd = zzhlg5;
    }

    public final zzexl zza() {
        zzgge zzgge2 = zzcci.zza;
        zzhkx.zzb(zzgge2);
        Context context = ((zzcjj)this.zzb).zza();
        VersionInfoParcel versionInfoParcel = ((zzcjv)this.zzc).zza();
        String string2 = ((zzcjo)this.zzd).zza();
        zzexl zzexl2 = new zzexl(zzgge2, context, versionInfoParcel, string2);
        return zzexl2;
    }
}

