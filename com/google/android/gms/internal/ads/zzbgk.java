/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbfv;

public final class zzbgk {
    public static final zzbfv zza = zzbfv.zzd("gads:disable_flag_shared_pref_listener:enabled", false);
    public static final zzbfv zzb = zzbfv.zzd("gads:include_package_name:enabled", false);
    public static final zzbfv zzc = zzbfv.zzd("gads:js_flags:mf", false);
    public static final zzbfv zzd = zzbfv.zzb("gads:js_flags:update_interval", 14400000L);
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
        zze = zzbfv.zzd("gads:persist_js_flag:ars", bl2);
        zzf = zzbfv.zzd("gads:persist_js_flag:as", bl2);
        zzg = zzbfv.zzd("gads:persist_js_flag:scar", bl2);
        zzh = zzbfv.zzd("gads:read_local_flags:enabled", false);
        zzi = zzbfv.zzd("gads:read_local_flags_cld:enabled", false);
        zzj = zzbfv.zzd("gads:write_local_flags_cld:enabled", false);
        zzk = zzbfv.zzd("gads:write_local_flags_client:enabled", false);
        zzl = zzbfv.zzd("gads:write_local_flags_service:enabled", false);
    }
}

