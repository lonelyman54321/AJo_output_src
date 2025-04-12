/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzbgd;
import com.google.android.gms.internal.ads.zzdab;
import com.google.android.gms.internal.ads.zzdgn;
import com.google.android.gms.internal.ads.zzdgr;
import com.google.android.gms.internal.ads.zzfmb;
import com.google.android.gms.internal.ads.zzfmc;
import com.google.android.gms.internal.ads.zzfmn;
import com.google.android.gms.internal.ads.zzfmu;

public final class zzflz
implements zzdgn,
zzdab,
zzdgr {
    private final zzfmn zza;
    private final zzfmc zzb;

    public zzflz(Context object, zzfmn object2) {
        this.zza = object2;
        object2 = zzfmu.zzx;
        object = zzfmb.zza(object, (zzfmu)object2);
        this.zzb = object;
    }

    public final void zza() {
    }

    public final void zzb() {
        Object object = (Boolean)zzbgd.zzd.zze();
        boolean bl2 = (Boolean)object;
        if (bl2) {
            object = this.zza;
            zzfmc zzfmc2 = this.zzb;
            boolean bl3 = true;
            zzfmc2.zzh(bl3);
            ((zzfmn)object).zza(zzfmc2);
        }
    }

    public final void zzk() {
    }

    public final void zzl() {
        Object object = (Boolean)zzbgd.zzd.zze();
        boolean bl2 = (Boolean)object;
        if (bl2) {
            object = this.zzb;
            object.zzj();
        }
    }

    public final void zzq(zze object) {
        Object object2 = (Boolean)zzbgd.zzd.zze();
        boolean bl2 = (Boolean)object2;
        if (bl2) {
            object2 = this.zza;
            zzfmc zzfmc2 = this.zzb;
            object = ((zze)object).zza().toString();
            zzfmc2.zzc((String)object);
            object = null;
            zzfmc2.zzh(false);
            ((zzfmn)object2).zza(zzfmc2);
        }
    }
}

