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
import com.google.android.gms.internal.measurement.zznn;

public final class zznq
implements zznn {
    private static final zzhx zza;

    static {
        Uri uri = zzhu.zza("com.google.android.gms.measurement");
        zzif zzif2 = new zzif(uri);
        zzif2 = zzif2.zzb().zza();
        boolean bl2 = true;
        zza = zzif2.zza("measurement.service.ad_impression.convert_value_to_double", bl2);
        zzif2.zza("measurement.client.ad_impression", bl2);
        zzif2.zza("measurement.service.separate_public_internal_event_blacklisting", bl2);
        zzif2.zza("measurement.service.ad_impression", bl2);
    }

    public final boolean zza() {
        return (Boolean)zza.zza();
    }
}

