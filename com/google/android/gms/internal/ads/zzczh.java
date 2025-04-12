/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzcaa;
import com.google.android.gms.internal.ads.zzcab;
import com.google.android.gms.internal.ads.zzcac;
import com.google.android.gms.internal.ads.zzcjv;
import com.google.android.gms.internal.ads.zzcvg;
import com.google.android.gms.internal.ads.zzczg;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfgy;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhlg;

public final class zzczh
implements zzhkp {
    private final zzczg zza;
    private final zzhlg zzb;
    private final zzhlg zzc;
    private final zzhlg zzd;
    private final zzhlg zze;

    public zzczh(zzczg zzczg2, zzhlg zzhlg2, zzhlg zzhlg3, zzhlg zzhlg4, zzhlg zzhlg5) {
        this.zza = zzczg2;
        this.zzb = zzhlg2;
        this.zzc = zzhlg3;
        this.zzd = zzhlg4;
        this.zze = zzhlg5;
    }

    public final /* synthetic */ Object zzb() {
        Object object;
        Object object2 = object = this.zzb.zzb();
        object2 = (Context)object;
        VersionInfoParcel versionInfoParcel = ((zzcjv)this.zzc).zza();
        object = ((zzcvg)this.zzd).zza();
        zzcab zzcab2 = new zzcab();
        zzcac zzcac2 = ((zzfgt)object).zzB;
        Object object3 = null;
        if (zzcac2 != null) {
            object = ((zzfgt)object).zzt;
            Object object4 = object == null ? null : (object = ((zzfgy)object).zzb);
            object3 = object;
            object = new zzcaa((Context)object2, versionInfoParcel, zzcac2, (String)object4, zzcab2);
        }
        return object3;
    }
}

