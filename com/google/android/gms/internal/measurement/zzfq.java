/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.os.Bundle
 */
package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdl;
import com.google.android.gms.internal.measurement.zzeb;
import com.google.android.gms.internal.measurement.zzed;
import com.google.android.gms.internal.measurement.zzed$zzb;
import com.google.android.gms.internal.measurement.zzed$zzc;

final class zzfq
extends zzed$zzb {
    private final /* synthetic */ Bundle zzc;
    private final /* synthetic */ Activity zzd;
    private final /* synthetic */ zzed$zzc zze;

    public zzfq(zzed$zzc object, Bundle bundle, Activity activity) {
        this.zzc = bundle;
        this.zzd = activity;
        this.zze = object;
        object = ((zzed$zzc)object).zza;
        super((zzed)object);
    }

    public final void zza() {
        Object object;
        Object object2;
        Bundle bundle = this.zzc;
        if (bundle != null) {
            boolean bl2;
            bundle = new Bundle();
            object2 = this.zzc;
            object = "com.google.app_measurement.screen_service";
            boolean bl3 = object2.containsKey((String)object);
            if (bl3 && (bl2 = (object2 = this.zzc.get((String)object)) instanceof Bundle)) {
                bundle.putBundle((String)object, object2);
            }
        } else {
            bundle = null;
        }
        object2 = (zzdl)Preconditions.checkNotNull(zzed.zza(this.zze.zza));
        object = zzeb.zza(this.zzd);
        long l2 = this.zzb;
        object2.onActivityCreatedByScionActivityInfo((zzeb)object, bundle, l2);
    }
}

