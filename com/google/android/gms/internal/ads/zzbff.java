/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.zzg;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbfg;

public final class zzbff
extends zzbfg {
    private final zzg zza;
    private final String zzb;
    private final String zzc;

    public zzbff(zzg zzg2, String string2, String string3) {
        this.zza = zzg2;
        this.zzb = string2;
        this.zzc = string3;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final void zzd(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper == null) {
            return;
        }
        zzg zzg2 = this.zza;
        iObjectWrapper = (View)ObjectWrapper.unwrap(iObjectWrapper);
        zzg2.zza((View)iObjectWrapper);
    }

    public final void zze() {
        this.zza.zzb();
    }

    public final void zzf() {
        this.zza.zzc();
    }
}

