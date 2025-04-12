/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbro;
import com.google.android.gms.internal.ads.zzbsr;
import com.google.android.gms.internal.ads.zzeho;
import com.google.android.gms.internal.ads.zzeiu;
import com.google.android.gms.internal.ads.zzeiw;
import com.google.android.gms.internal.ads.zzejh;

final class zzeiv
extends zzbsr {
    final /* synthetic */ zzeiw zza;
    private final zzeho zzb;

    public /* synthetic */ zzeiv(zzeiw zzeiw2, zzeho zzeho2, zzeiu zzeiu2) {
        this.zza = zzeiw2;
        this.zzb = zzeho2;
    }

    public final void zze(String string2) {
        ((zzejh)this.zzb.zzc).zzi(0, string2);
    }

    public final void zzf(zze zze2) {
        ((zzejh)this.zzb.zzc).zzh(zze2);
    }

    public final void zzg(IObjectWrapper iObjectWrapper) {
        iObjectWrapper = (View)ObjectWrapper.unwrap(iObjectWrapper);
        zzeiw.zze(this.zza, (View)iObjectWrapper);
        ((zzejh)this.zzb.zzc).zzo();
    }

    public final void zzh(zzbro zzbro2) {
        zzeiw.zzd(this.zza, zzbro2);
        ((zzejh)this.zzb.zzc).zzo();
    }
}

