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
import com.google.android.gms.internal.measurement.zzof;

public final class zzoi
implements zzof {
    private static final zzhx zza;
    private static final zzhx zzb;

    static {
        Uri uri = zzhu.zza("com.google.android.gms.measurement");
        zzif zzif2 = new zzif(uri);
        zzif2 = zzif2.zzb().zza();
        boolean bl2 = true;
        zzif2.zza("measurement.collection.event_safelist", bl2);
        zza = zzif2.zza("measurement.service.store_null_safelist", bl2);
        zzb = zzif2.zza("measurement.service.store_safelist", bl2);
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
}

