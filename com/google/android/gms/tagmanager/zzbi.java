/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.tagmanager;

import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.tagmanager.zzbg;
import com.google.android.gms.tagmanager.zzbh;
import com.google.android.gms.tagmanager.zzce;
import com.google.android.gms.tagmanager.zzch;
import com.google.android.gms.tagmanager.zzcj;
import java.util.Map;

final class zzbi
extends zzcj {
    final /* synthetic */ AppMeasurement zza;

    public zzbi(AppMeasurement appMeasurement) {
        this.zza = appMeasurement;
    }

    public final Map zzb() {
        return this.zza.getUserProperties(true);
    }

    public final void zzc(String string2, String string3, Bundle bundle, long l2) {
        this.zza.logEventInternalNoInterceptor(string2, string3, bundle, l2);
    }

    public final void zzd(zzce zzce2) {
        zzbh zzbh2 = new zzbh(this, zzce2);
        this.zza.registerOnMeasurementEventListener(zzbh2);
    }

    public final void zze(zzch zzch2) {
        zzbg zzbg2 = new zzbg(this, zzch2);
        this.zza.setEventInterceptor(zzbg2);
    }
}

