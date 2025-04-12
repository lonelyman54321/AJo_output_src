/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzbyd;
import com.google.android.gms.internal.ads.zzcjj;
import com.google.android.gms.internal.ads.zzcjv;
import com.google.android.gms.internal.ads.zzdsq;
import com.google.android.gms.internal.ads.zzeef;
import com.google.android.gms.internal.ads.zzfmq;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhlg;

public final class zzfmd
implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;
    private final zzhlg zzc;
    private final zzhlg zzd;
    private final zzhlg zze;

    public zzfmd(zzhlg zzhlg2, zzhlg zzhlg3, zzhlg zzhlg4, zzhlg zzhlg5, zzhlg zzhlg6) {
        this.zza = zzhlg2;
        this.zzb = zzhlg3;
        this.zzc = zzhlg4;
        this.zzd = zzhlg5;
        this.zze = zzhlg6;
    }

    public final /* synthetic */ Object zzb() {
        Object object;
        Context context = ((zzcjj)this.zza).zza();
        VersionInfoParcel versionInfoParcel = ((zzcjv)this.zzb).zza();
        Object object2 = object = this.zzc.zzb();
        object2 = (zzdsq)object;
        zzeef zzeef2 = new zzeef();
        zzbyd zzbyd2 = new zzbyd();
        object = new zzfmq(context, versionInfoParcel, (zzdsq)object2, zzeef2, zzbyd2);
        return object;
    }
}

