/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk$OnEventListener;
import com.google.firebase.analytics.connector.internal.zzd;
import com.google.firebase.analytics.connector.internal.zze;

final class zzg
implements AppMeasurementSdk$OnEventListener {
    private final /* synthetic */ zze zza;

    public zzg(zze zze2) {
        this.zza = zze2;
    }

    public final void onEvent(String string2, String object, Bundle bundle, long l2) {
        boolean bl2;
        if (string2 != null && (bl2 = zzd.zze((String)object))) {
            string2 = new Bundle();
            String string3 = "name";
            string2.putString(string3, (String)object);
            string2.putLong("timestampInMillis", l2);
            string2.putBundle("params", bundle);
            object = zze.zza(this.zza);
            int n3 = 3;
            object.onMessageTriggered(n3, (Bundle)string2);
        }
    }
}

