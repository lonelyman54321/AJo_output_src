/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk$OnEventListener;
import com.google.firebase.analytics.connector.internal.zzc;
import com.google.firebase.analytics.connector.internal.zzd;

final class zzf
implements AppMeasurementSdk$OnEventListener {
    private final /* synthetic */ zzc zza;

    public zzf(zzc zzc2) {
        this.zza = zzc2;
    }

    public final void onEvent(String object, String string2, Bundle bundle, long l2) {
        object = this.zza.zza;
        boolean bl2 = object.contains(string2);
        if (!bl2) {
            return;
        }
        object = new Bundle();
        string2 = zzd.zza(string2);
        object.putString("events", string2);
        zzc.zza(this.zza).onMessageTriggered(2, (Bundle)object);
    }
}

