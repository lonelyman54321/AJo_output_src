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
import com.google.android.gms.internal.measurement.zzox;

public final class zzpa
implements zzox {
    private static final zzhx zza;
    private static final zzhx zzb;
    private static final zzhx zzc;
    private static final zzhx zzd;
    private static final zzhx zze;
    private static final zzhx zzf;
    private static final zzhx zzg;
    private static final zzhx zzh;
    private static final zzhx zzi;
    private static final zzhx zzj;

    static {
        Uri uri = zzhu.zza("com.google.android.gms.measurement");
        zzif zzif2 = new zzif(uri);
        zzif2 = zzif2.zzb().zza();
        boolean bl2 = true;
        zza = zzif2.zza("measurement.rb.attribution.ad_campaign_info", bl2);
        zzif2.zza("measurement.rb.attribution.client.bundle_on_backgrounded", bl2);
        zzif2.zza("measurement.rb.attribution.service.bundle_on_backgrounded", bl2);
        zzb = zzif2.zza("measurement.rb.attribution.client2", bl2);
        zzif2.zza("measurement.rb.attribution.dma_fix", bl2);
        zzc = zzif2.zza("measurement.rb.attribution.followup1.service", false);
        zzd = zzif2.zza("measurement.rb.attribution.client.get_trigger_uris_async", false);
        zze = zzif2.zza("measurement.rb.attribution.service.trigger_uris_high_priority", bl2);
        zzif2.zza("measurement.rb.attribution.index_out_of_bounds_fix", bl2);
        zzf = zzif2.zza("measurement.rb.attribution.service.enable_max_trigger_uris_queried_at_once", bl2);
        zzg = zzif2.zza("measurement.rb.attribution.retry_disposition", false);
        zzh = zzif2.zza("measurement.rb.attribution.service", bl2);
        zzi = zzif2.zza("measurement.rb.attribution.enable_trigger_redaction", bl2);
        zzj = zzif2.zza("measurement.rb.attribution.uuid_generation", bl2);
        long l2 = 0L;
        zzif2.zza("measurement.id.rb.attribution.retry_disposition", l2);
        zzif2.zza("measurement.id.rb.attribution.client.get_trigger_uris_async", l2);
        zzif2.zza("measurement.rb.attribution.improved_retry", bl2);
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

    public final boolean zze() {
        return (Boolean)zzd.zza();
    }

    public final boolean zzf() {
        return (Boolean)zze.zza();
    }

    public final boolean zzg() {
        return (Boolean)zzf.zza();
    }

    public final boolean zzh() {
        return (Boolean)zzg.zza();
    }

    public final boolean zzi() {
        return (Boolean)zzh.zza();
    }

    public final boolean zzj() {
        return (Boolean)zzi.zza();
    }

    public final boolean zzk() {
        return (Boolean)zzj.zza();
    }
}

