/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package com.google.android.gms.internal.measurement;

import android.net.Uri;
import com.google.android.gms.internal.measurement.zzhu;
import com.google.android.gms.internal.measurement.zzhx;
import com.google.android.gms.internal.measurement.zzif;
import com.google.android.gms.internal.measurement.zzoe;

public final class zzod
implements zzoe {
    private static final zzhx zza;
    private static final zzhx zzb;

    static {
        Uri uri = zzhu.zza("com.google.android.gms.measurement");
        zzif zzif2 = new zzif(uri);
        zzif2 = zzif2.zzb().zza();
        zza = zzif2.zza("measurement.set_default_event_parameters_propagate_clear.client.dev", false);
        zzb = zzif2.zza("measurement.set_default_event_parameters_propagate_clear.service", false);
        zzif2.zza("measurement.id.set_default_event_parameters_propagate_clear.experiment_id", 0L);
    }

    public final boolean zza() {
        return (Boolean)zza.zza();
    }

    public final boolean zzb() {
        return (Boolean)zzb.zza();
    }
}

