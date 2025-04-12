/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 */
package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzgo;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzhk$zza;
import com.google.android.gms.measurement.internal.zzic;

public final class zzhk {
    private final zzhk$zza zza;

    public zzhk(zzhk$zza zzhk$zza) {
        Preconditions.checkNotNull(zzhk$zza);
        this.zza = zzhk$zza;
    }

    public final void zza(Context object, Intent object2) {
        zzgo zzgo2 = zzic.zza((Context)object, null, null).zzj();
        if (object2 == null) {
            zzgo2.zzr().zza("Receiver called with null intent");
            return;
        }
        object2 = object2.getAction();
        Object object3 = zzgo2.zzq();
        String string2 = "Local receiver got";
        ((zzgq)object3).zza(string2, object2);
        object3 = "com.google.android.gms.measurement.UPLOAD";
        boolean bl2 = ((String)object3).equals(object2);
        if (bl2) {
            object2 = new Intent();
            object2 = object2.setClassName((Context)object, "com.google.android.gms.measurement.AppMeasurementService");
            object2.setAction((String)object3);
            zzgo2.zzq().zza("Starting wakeful intent.");
            this.zza.doStartService((Context)object, (Intent)object2);
            return;
        }
        object = "com.android.vending.INSTALL_REFERRER";
        boolean bl3 = ((String)object).equals(object2);
        if (bl3) {
            object = zzgo2.zzr();
            object2 = "Install Referrer Broadcasts are deprecated";
            ((zzgq)object).zza((String)object2);
        }
    }
}

