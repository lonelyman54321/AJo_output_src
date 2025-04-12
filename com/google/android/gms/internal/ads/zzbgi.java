/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbfv;

public final class zzbgi {
    public static final zzbfv zza;
    public static final zzbfv zzb;
    public static final zzbfv zzc;
    public static final zzbfv zzd;
    public static final zzbfv zze;
    public static final zzbfv zzf;
    public static final zzbfv zzg;
    public static final zzbfv zzh;
    public static final zzbfv zzi;
    public static final zzbfv zzj;
    public static final zzbfv zzk;
    public static final zzbfv zzl;

    static {
        boolean bl2 = true;
        zza = zzbfv.zzd("gads:init:init_on_bg_thread", bl2);
        zzb = zzbfv.zzd("gads:init:init_on_single_bg_thread", false);
        zzc = zzbfv.zzd("gads:adloader_load_bg_thread", bl2);
        zzd = zzbfv.zzd("gads:appopen_load_on_bg_thread", bl2);
        zze = zzbfv.zzd("gads:banner_destroy_bg_thread", false);
        zzf = zzbfv.zzd("gads:banner_load_bg_thread", bl2);
        zzg = zzbfv.zzd("gads:banner_pause_bg_thread", false);
        zzh = zzbfv.zzd("gads:banner_resume_bg_thread", false);
        zzi = zzbfv.zzd("gads:interstitial_load_on_bg_thread", bl2);
        zzj = zzbfv.zzd("gads:persist_flags_on_bg_thread", bl2);
        zzk = zzbfv.zzd("gads:query_info_bg_thread", bl2);
        zzl = zzbfv.zzd("gads:rewarded_load_bg_thread", bl2);
    }
}

