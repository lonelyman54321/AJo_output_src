/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbfv;

public final class zzbgg {
    public static final zzbfv zza;
    public static final zzbfv zzb;

    static {
        boolean bl2 = true;
        zza = zzbfv.zzd("gads:debug_logging_feature:enable", bl2);
        zzb = zzbfv.zzd("gads:debug_logging_feature:intercept_web_view", bl2);
    }
}

