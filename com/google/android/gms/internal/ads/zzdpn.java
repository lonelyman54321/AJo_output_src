/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzblp;
import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzcqd;
import com.google.android.gms.internal.ads.zzcrk;
import com.google.android.gms.internal.ads.zzdez;
import com.google.android.gms.internal.ads.zzdhc;
import com.google.android.gms.internal.ads.zzdpj;
import com.google.android.gms.internal.ads.zzdpk;
import com.google.android.gms.internal.ads.zzdpl;
import com.google.android.gms.internal.ads.zzdpm;
import java.util.Map;
import java.util.concurrent.Executor;

public final class zzdpn {
    private final Executor zza;
    private final zzcrk zzb;
    private final zzdhc zzc;
    private final zzcqd zzd;

    public zzdpn(Executor executor, zzcrk zzcrk2, zzdhc zzdhc2, zzcqd zzcqd2) {
        this.zza = executor;
        this.zzc = zzdhc2;
        this.zzb = zzcrk2;
        this.zzd = zzcqd2;
    }

    public final void zza(zzchd zzchd2) {
        if (zzchd2 == null) {
            return;
        }
        Object object = this.zzc;
        Object object2 = zzchd2.zzF();
        ((zzdhc)object).zza((View)object2);
        object = this.zzc;
        object2 = new zzdpj(zzchd2);
        Object object3 = this.zza;
        ((zzdez)object).zzo(object2, (Executor)object3);
        object = this.zzc;
        object2 = new zzdpk(zzchd2);
        object3 = this.zza;
        ((zzdez)object).zzo(object2, (Executor)object3);
        object = this.zzc;
        object2 = this.zzb;
        object3 = this.zza;
        ((zzdez)object).zzo(object2, (Executor)object3);
        this.zzb.zzf(zzchd2);
        object = zzchd2.zzN();
        object2 = zzbep.zzkf;
        object3 = zzba.zzc();
        object2 = (Boolean)((zzben)object3).zza((zzbeg)object2);
        boolean bl2 = (Boolean)object2;
        if (bl2 && object != null) {
            object2 = this.zzd;
            object.zzJ((zzcqd)object2);
            object2 = this.zzd;
            object3 = null;
            object.zzK((zzcqd)object2, null, null);
        }
        object = new zzdpl(this);
        zzchd2.zzag("/trackActiveViewUnit", (zzblp)object);
        object = new zzdpm(this);
        zzchd2.zzag("/untrackActiveViewUnit", (zzblp)object);
    }

    public final /* synthetic */ void zzb(zzchd zzchd2, Map map2) {
        this.zzb.zzb();
    }

    public final /* synthetic */ void zzc(zzchd zzchd2, Map map2) {
        this.zzb.zza();
    }
}

