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
import com.google.android.gms.internal.measurement.zzpj;

public final class zzpm
implements zzpj {
    private static final zzhx zza;

    static {
        Uri uri = zzhu.zza("com.google.android.gms.measurement");
        zzif zzif2 = new zzif(uri);
        zzif2 = zzif2.zzb().zza();
        boolean bl2 = true;
        zzif2.zza("measurement.client.sessions.background_sessions_enabled", bl2);
        zza = zzif2.zza("measurement.client.sessions.enable_fix_background_engagement", false);
        zzif2.zza("measurement.client.sessions.immediate_start_enabled_foreground", bl2);
        zzif2.zza("measurement.client.sessions.enable_pause_engagement_in_background", bl2);
        zzif2.zza("measurement.client.sessions.remove_expired_session_properties_enabled", bl2);
        zzif2.zza("measurement.client.sessions.session_id_enabled", bl2);
        zzif2.zza("measurement.id.client.sessions.enable_fix_background_engagement", 0L);
    }

    public final boolean zza() {
        return (Boolean)zza.zza();
    }
}

