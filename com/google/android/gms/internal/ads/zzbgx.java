/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbfv;

public final class zzbgx {
    public static final zzbfv zza;
    public static final zzbfv zzb;
    public static final zzbfv zzc;

    static {
        long l2 = 60000L;
        zza = zzbfv.zzb("gads:ad_loader:timeout_ms", l2);
        zzb = zzbfv.zzb("gads:rendering:timeout_ms", l2);
        zzc = zzbfv.zzb("gads:resolve_future:default_timeout_ms", 30000L);
    }
}

