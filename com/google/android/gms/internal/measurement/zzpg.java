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
import com.google.android.gms.internal.measurement.zzpd;

public final class zzpg
implements zzpd {
    private static final zzhx zza;

    static {
        Uri uri = zzhu.zza("com.google.android.gms.measurement");
        zzif zzif2 = new zzif(uri);
        zza = zzif2.zzb().zza().zza("measurement.backfill_session_ids.service", false);
    }

    public final boolean zza() {
        return true;
    }

    public final boolean zzb() {
        return (Boolean)zza.zza();
    }
}

