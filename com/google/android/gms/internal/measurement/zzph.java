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
import com.google.android.gms.internal.measurement.zzpi;

public final class zzph
implements zzpi {
    private static final zzhx zza;

    static {
        Uri uri = zzhu.zza("com.google.android.gms.measurement");
        zzif zzif2 = new zzif(uri);
        zzif2 = zzif2.zzb().zza();
        boolean bl2 = true;
        zzif2.zza("measurement.collection.enable_session_stitching_token.client.dev", bl2);
        zzif2.zza("measurement.collection.enable_session_stitching_token.first_open_fix", bl2);
        zza = zzif2.zza("measurement.session_stitching_token_enabled", false);
        zzif2.zza("measurement.link_sst_to_sid", bl2);
    }

    public final boolean zza() {
        return true;
    }

    public final boolean zzb() {
        return (Boolean)zza.zza();
    }
}

