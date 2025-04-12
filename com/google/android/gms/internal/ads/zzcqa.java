/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbwj;
import com.google.android.gms.internal.ads.zzbwl;
import com.google.android.gms.internal.ads.zzcqc;
import com.google.android.gms.internal.ads.zzcqd;
import com.google.android.gms.internal.ads.zzfoe;

public final class zzcqa
implements Runnable {
    public final /* synthetic */ zzcqc zza;
    public final /* synthetic */ Throwable zzb;
    public final /* synthetic */ zzfoe zzc;
    public final /* synthetic */ String zzd;

    public /* synthetic */ zzcqa(zzcqc zzcqc2, Throwable throwable, zzfoe zzfoe2, String string2) {
        this.zza = zzcqc2;
        this.zzb = throwable;
        this.zzc = zzfoe2;
        this.zzd = string2;
    }

    public final void run() {
        Object object = zzbep.zzko;
        object = (Boolean)zzba.zzc().zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        Object object2 = this.zza;
        Throwable throwable = this.zzb;
        if (bl2) {
            zzbwl zzbwl2;
            object = ((zzcqc)object2).zzc;
            ((zzcqd)object).zzb = zzbwl2 = zzbwj.zzc(zzcqd.zza((zzcqd)object));
            object = ((zzcqc)object2).zzc.zzb;
            object2 = "AttributionReporting.registerSourceAndPingClickUrl";
            object.zzh(throwable, (String)object2);
        } else {
            zzbwl zzbwl3;
            object = ((zzcqc)object2).zzc;
            ((zzcqd)object).zza = zzbwl3 = zzbwj.zza(zzcqd.zza((zzcqd)object));
            object = ((zzcqc)object2).zzc.zza;
            object2 = "AttributionReportingSampled.registerSourceAndPingClickUrl";
            object.zzh(throwable, (String)object2);
        }
        object = this.zzd;
        this.zzc.zzc((String)object, null);
    }
}

