/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbfv;
import com.google.android.gms.internal.ads.zzbfw;

public final class zzbga {
    public static final zzbfv zza;
    public static final zzbfv zzb;
    public static final zzbfv zzc;
    public static final zzbfv zzd;
    public static final zzbfv zze;

    static {
        boolean bl2 = true;
        zza = zzbfw.zzf("gads:consent:gmscore:dsid:enabled", bl2);
        zzb = zzbfw.zzf("gads:consent:gmscore:lat:enabled", bl2);
        zzbfw zzbfw2 = new zzbfw("gads:consent:gmscore:backend_url", "https://adservice.google.com/getconfig/pubvendors", 4);
        zzc = zzbfw2;
        Long l2 = 10000L;
        zzbfw2 = new zzbfw("gads:consent:gmscore:time_out", l2, 2);
        zzd = zzbfw2;
        zze = zzbfw.zzf("gads:consent:gmscore:enabled", bl2);
    }
}

