/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbpx;
import com.google.android.gms.internal.ads.zzbpy;
import com.google.android.gms.internal.ads.zzbpz;
import com.google.android.gms.internal.ads.zzbqa;
import com.google.android.gms.internal.ads.zzbqe;
import com.google.android.gms.internal.ads.zzbqh;
import com.google.android.gms.internal.ads.zzbxo;
import com.google.android.gms.internal.ads.zzbxq;
import com.google.android.gms.internal.ads.zzcjj;
import com.google.android.gms.internal.ads.zzfmq;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhlg;

public final class zzckf
implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;

    public zzckf(zzhlg zzhlg2, zzhlg zzhlg3) {
        this.zza = zzhlg2;
        this.zzb = zzhlg3;
    }

    public final zzbxo zza() {
        Context context = ((zzcjj)this.zza).zza();
        Object object = (zzfmq)this.zzb.zzb();
        Object object2 = zzu.zzf();
        Object object3 = VersionInfoParcel.forPackage();
        object2 = ((zzbpy)object2).zzb(context, (VersionInfoParcel)object3, (zzfmq)object);
        object3 = zzbqe.zza;
        ((zzbqh)object2).zza("google.afma.request.getAdDictionary", (zzbqa)object3, (zzbpz)object3);
        object2 = zzu.zzf();
        VersionInfoParcel versionInfoParcel = VersionInfoParcel.forPackage();
        object = ((zzbpy)object2).zzb(context, versionInfoParcel, (zzfmq)object).zza("google.afma.sdkConstants.getSdkConstants", (zzbqa)object3, (zzbpz)object3);
        object3 = VersionInfoParcel.forPackage();
        object2 = new zzbxq(context, (zzbpx)object, (VersionInfoParcel)object3);
        return object2;
    }
}

