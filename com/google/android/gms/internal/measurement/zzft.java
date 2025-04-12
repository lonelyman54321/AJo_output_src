/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdl;
import com.google.android.gms.internal.measurement.zzdm;
import com.google.android.gms.internal.measurement.zzeb;
import com.google.android.gms.internal.measurement.zzed;
import com.google.android.gms.internal.measurement.zzed$zzb;
import com.google.android.gms.internal.measurement.zzed$zzc;

final class zzft
extends zzed$zzb {
    private final /* synthetic */ Activity zzc;
    private final /* synthetic */ zzdm zzd;
    private final /* synthetic */ zzed$zzc zze;

    public zzft(zzed$zzc object, Activity activity, zzdm zzdm2) {
        this.zzc = activity;
        this.zzd = zzdm2;
        this.zze = object;
        object = ((zzed$zzc)object).zza;
        super((zzed)object);
    }

    public final void zza() {
        zzdl zzdl2 = (zzdl)Preconditions.checkNotNull(zzed.zza(this.zze.zza));
        zzeb zzeb2 = zzeb.zza(this.zzc);
        zzdm zzdm2 = this.zzd;
        long l2 = this.zzb;
        zzdl2.onActivitySaveInstanceStateByScionActivityInfo(zzeb2, zzdm2, l2);
    }
}

