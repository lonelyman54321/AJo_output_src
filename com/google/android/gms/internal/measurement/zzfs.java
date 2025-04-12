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
import com.google.android.gms.internal.measurement.zzeb;
import com.google.android.gms.internal.measurement.zzed;
import com.google.android.gms.internal.measurement.zzed$zzb;
import com.google.android.gms.internal.measurement.zzed$zzc;

final class zzfs
extends zzed$zzb {
    private final /* synthetic */ Activity zzc;
    private final /* synthetic */ zzed$zzc zzd;

    public zzfs(zzed$zzc object, Activity activity) {
        this.zzc = activity;
        this.zzd = object;
        object = ((zzed$zzc)object).zza;
        super((zzed)object);
    }

    public final void zza() {
        zzdl zzdl2 = (zzdl)Preconditions.checkNotNull(zzed.zza(this.zzd.zza));
        zzeb zzeb2 = zzeb.zza(this.zzc);
        long l2 = this.zzb;
        zzdl2.onActivityResumedByScionActivityInfo(zzeb2, l2);
    }
}

