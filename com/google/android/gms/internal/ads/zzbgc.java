/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbfv;

public final class zzbgc {
    public static final zzbfv zza = zzbfv.zzd("gads:always_enable_crash_loop_counter:enabled", false);
    public static final zzbfv zzb = zzbfv.zzd("gads:crash_loop_stats_signal:enabled", false);
    public static final zzbfv zzc = zzbfv.zzd("gads:crash_without_flag_write_count:enabled", false);
    public static final zzbfv zzd;
    public static final zzbfv zze;
    public static final zzbfv zzf;
    public static final zzbfv zzg;
    public static final zzbfv zzh;
    public static final zzbfv zzi;
    public static final zzbfv zzj;

    static {
        long l2 = -1;
        zzd = zzbfv.zzb("gads:crash_without_write_reset:count", l2);
        zze = zzbfv.zzd("gads:init_without_flag_write_count:enabled", false);
        zzf = zzbfv.zzb("gads:init_without_write_reset:count", l2);
        zzg = zzbfv.zzd("gads:reset_app_settings:enabled", false);
        zzh = zzbfv.zzd("gads:reset_counts_on_failure_service:enabled", false);
        zzi = zzbfv.zzd("gads:reset_counts_on_local_flag_save:enabled", false);
        zzj = zzbfv.zzd("gads:reset_counts_on_successful_service:enabled", false);
    }
}

