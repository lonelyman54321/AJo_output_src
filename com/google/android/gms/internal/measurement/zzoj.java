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
import com.google.android.gms.internal.measurement.zzok;

public final class zzoj
implements zzok {
    private static final zzhx zza;
    private static final zzhx zzb;
    private static final zzhx zzc;

    static {
        Uri uri = zzhu.zza("com.google.android.gms.measurement");
        zzif zzif2 = new zzif(uri);
        zzif2 = zzif2.zzb().zza();
        zzif2.zza("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        zza = zzif2.zza("measurement.audience.refresh_event_count_filters_timestamp", false);
        zzb = zzif2.zza("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        zzc = zzif2.zza("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    public final boolean zza() {
        return true;
    }

    public final boolean zzb() {
        return (Boolean)zza.zza();
    }

    public final boolean zzc() {
        return (Boolean)zzb.zza();
    }

    public final boolean zzd() {
        return (Boolean)zzc.zza();
    }
}

