/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbfv;

public final class zzbgd {
    public static final zzbfv zza = zzbfv.zza("gads:cui_monitoring_session_sample_rate", 0.03);
    public static final zzbfv zzb;
    public static final zzbfv zzc;
    public static final zzbfv zzd;
    public static final zzbfv zze;

    static {
        boolean bl2 = true;
        zzb = zzbfv.zzd("gads:cui_monitoring_enabled", bl2);
        zzc = zzbfv.zzd("gads:cui_monitoring_v2_enabled", bl2);
        zzd = zzbfv.zzd("gads:cui_monitoring_v3_enabled", bl2);
        zze = zzbfv.zzd("gads:cui_monitoring_v4_enabled", bl2);
    }
}

