/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Looper
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.internal.ads.zzfrq;
import com.google.android.gms.internal.ads.zzfsb;
import com.google.android.gms.internal.ads.zzfsc;
import com.google.android.gms.internal.ads.zzfsd;
import com.google.android.gms.internal.ads.zzfsf;
import com.google.android.gms.internal.ads.zzfsi;
import com.google.android.gms.internal.ads.zzfsj;
import com.google.android.gms.internal.ads.zzhbi;

public final class zzfrp {
    private final Context zza;
    private final Looper zzb;

    public zzfrp(Context context, Looper looper) {
        this.zza = context;
        this.zzb = looper;
    }

    public final void zza(String object) {
        Object object2 = zzfsj.zza();
        Object object3 = this.zza.getPackageName();
        ((zzfsf)object2).zza((String)object3);
        object3 = zzfsi.zzb;
        ((zzfsf)object2).zzc((zzfsi)object3);
        object3 = zzfsd.zza();
        ((zzfsc)object3).zzb((String)object);
        object = zzfsb.zzb;
        ((zzfsc)object3).zza((zzfsb)object);
        ((zzfsf)object2).zzb((zzfsc)object3);
        object = (zzfsj)((zzhbi)object2).zzbn();
        object3 = this.zza;
        Looper looper = this.zzb;
        object2 = new zzfrq((Context)object3, looper, (zzfsj)object);
        ((zzfrq)object2).zza();
    }
}

