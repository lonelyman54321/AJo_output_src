/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbfv;

public final class zzbgr {
    public static final zzbfv zza;
    public static final zzbfv zzb;
    public static final zzbfv zzc;
    public static final zzbfv zzd;

    static {
        boolean bl2 = true;
        zza = zzbfv.zzd("gads:separate_url_generation:enabled", bl2);
        zzb = zzbfv.zzc("gads:google_ad_request_domains", "googleads.g.doubleclick.net;pubads.g.doubleclick.net");
        zzc = zzbfv.zzb("gads:url_cache:max_size", 200L);
        zzd = zzbfv.zzd("gads:use_request_id_as_url_cache_key:enabled", bl2);
    }
}

