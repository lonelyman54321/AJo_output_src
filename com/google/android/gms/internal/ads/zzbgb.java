/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbfv;

public final class zzbgb {
    public static final zzbfv zza;
    public static final zzbfv zzb;
    public static final zzbfv zzc;
    public static final zzbfv zzd;
    public static final zzbfv zze;
    public static final zzbfv zzf;

    static {
        long l2 = 1L;
        zza = zzbfv.zzb("gads:content_age_weight", l2);
        zzb = zzbfv.zzd("gads:enable_content_fetching", true);
        long l3 = 10;
        zzc = zzbfv.zzb("gads:fingerprint_number", l3);
        zzd = zzbfv.zzb("gads:content_length_weight", l2);
        zze = zzbfv.zzb("gads:min_content_len", 11);
        zzf = zzbfv.zzb("gads:sleep_sec", l3);
    }
}

