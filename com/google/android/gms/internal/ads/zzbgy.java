/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbfv;

public final class zzbgy {
    public static final zzbfv zza;
    public static final zzbfv zzb;
    public static final zzbfv zzc;
    public static final zzbfv zzd;

    static {
        boolean bl2 = true;
        zza = zzbfv.zzd("gads:invalidate_token_at_refresh_start", bl2);
        zzb = zzbfv.zzd("gms:expose_token_for_gma:enabled", bl2);
        zzc = zzbfv.zzb("gads:timeout_for_trustless_token:millis", 2000L);
        zzd = zzbfv.zzb("gads:cached_token:ttl_millis", 10800000L);
    }
}

