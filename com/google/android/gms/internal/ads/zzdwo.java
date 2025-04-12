/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzcjd;
import com.google.android.gms.internal.ads.zzdwc;
import com.google.android.gms.internal.ads.zzdwh;
import com.google.android.gms.internal.ads.zzdwn;
import com.google.android.gms.internal.ads.zzepk;

public final class zzdwo
implements zzdwc {
    private final long zza;
    private final zzepk zzb;

    public zzdwo(long l2, Context context, zzdwh zzdwh2, zzcjd zzcjd2, String string2) {
        this.zza = l2;
        Object object = zzcjd2.zzv();
        object.zzc(context);
        Object object2 = new zzq();
        object.zza((zzq)object2);
        object.zzb(string2);
        this.zzb = object = object.zzd().zza();
        object2 = new zzdwn(this, zzdwh2);
        ((zzepk)object).zzD((zzbh)object2);
    }

    public static /* bridge */ /* synthetic */ long zzd(zzdwo zzdwo2) {
        return zzdwo2.zza;
    }

    public final void zza() {
        this.zzb.zzx();
    }

    public final void zzb(zzl zzl2) {
        this.zzb.zzab(zzl2);
    }

    public final void zzc() {
        zzepk zzepk2 = this.zzb;
        IObjectWrapper iObjectWrapper = ObjectWrapper.wrap(null);
        zzepk2.zzW(iObjectWrapper);
    }
}

