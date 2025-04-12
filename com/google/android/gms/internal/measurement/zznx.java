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
import com.google.android.gms.internal.measurement.zzny;

public final class zznx
implements zzny {
    private static final zzhx zza;

    static {
        Uri uri = zzhu.zza("com.google.android.gms.measurement");
        zzif zzif2 = new zzif(uri);
        zzif2 = zzif2.zzb().zza();
        boolean bl2 = true;
        zzif2.zza("measurement.client.consent_state_v1", bl2);
        zzif2.zza("measurement.client.3p_consent_state_v1", bl2);
        zzif2.zza("measurement.service.consent_state_v1_W36", bl2);
        zza = zzif2.zza("measurement.service.storage_consent_support_version", 203600L);
    }

    public final long zza() {
        return (Long)zza.zza();
    }
}

