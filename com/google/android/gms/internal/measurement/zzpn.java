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
import com.google.android.gms.internal.measurement.zzpo;

public final class zzpn
implements zzpo {
    private static final zzhx zza;
    private static final zzhx zzb;
    private static final zzhx zzc;
    private static final zzhx zzd;
    private static final zzhx zze;
    private static final zzhx zzf;
    private static final zzhx zzg;

    static {
        Uri uri = zzhu.zza("com.google.android.gms.measurement");
        zzif zzif2 = new zzif(uri);
        zzif2 = zzif2.zzb().zza();
        zza = zzif2.zza("measurement.sgtm.client.scion_upload_action.dev", false);
        zzb = zzif2.zza("measurement.sgtm.client.upload_on_backgrounded.dev", false);
        zzc = zzif2.zza("measurement.sgtm.google_signal.enable", false);
        zzd = zzif2.zza("measurement.sgtm.no_proxy.client.dev", false);
        zze = zzif2.zza("measurement.sgtm.no_proxy.service", false);
        boolean bl2 = true;
        zzif2.zza("measurement.sgtm.preview_mode_enabled", bl2);
        zzif2.zza("measurement.sgtm.rollout_percentage_fix", bl2);
        zzif2.zza("measurement.sgtm.service", bl2);
        zzf = zzif2.zza("measurement.sgtm.service.batching_on_backgrounded", false);
        zzg = zzif2.zza("measurement.sgtm.upload_queue", false);
        zzif2.zza("measurement.id.sgtm", 0L);
    }

    public final boolean zza() {
        return (Boolean)zza.zza();
    }

    public final boolean zzb() {
        return (Boolean)zzb.zza();
    }

    public final boolean zzc() {
        return (Boolean)zzc.zza();
    }

    public final boolean zzd() {
        return (Boolean)zzd.zza();
    }

    public final boolean zze() {
        return (Boolean)zze.zza();
    }

    public final boolean zzf() {
        return (Boolean)zzf.zza();
    }

    public final boolean zzg() {
        return (Boolean)zzg.zza();
    }
}

