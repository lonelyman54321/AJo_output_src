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
import com.google.android.gms.internal.measurement.zznz;

public final class zzoc
implements zznz {
    private static final zzhx zza;

    static {
        Uri uri = zzhu.zza("com.google.android.gms.measurement");
        zzif zzif2 = new zzif(uri);
        zzif2 = zzif2.zzb().zza();
        zzif2.zza("measurement.set_default_event_parameters_with_backfill.client.dev", false);
        boolean bl2 = true;
        zzif2.zza("measurement.defensively_copy_bundles_validate_default_params", bl2);
        zzif2.zza("measurement.set_default_event_parameters_with_backfill.service", bl2);
        zza = zzif2.zza("measurement.set_default_event_parameters.fix_deferred_analytics_collection", false);
        zzif2.zza("measurement.id.set_default_event_parameters.fix_deferred_analytics_collection", 0L);
        zzif2.zza("measurement.set_default_event_parameters.fix_subsequent_launches", bl2);
    }

    public final boolean zza() {
        return (Boolean)zza.zza();
    }
}

