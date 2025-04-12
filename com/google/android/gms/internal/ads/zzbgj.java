/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbfv;

public final class zzbgj {
    public static final zzbfv zza = zzbfv.zzc("gads:gma_attestation:click:macro_string", "@click_attok@");
    public static final zzbfv zzb = zzbfv.zzc("gads:gma_attestation:click:query_param", "attok");
    public static final zzbfv zzc = zzbfv.zzb("gads:gma_attestation:click:timeout", 2000L);
    public static final zzbfv zzd = zzbfv.zzd("gads:gma_attestation:click:enable", false);
    public static final zzbfv zze = zzbfv.zzb("gads:gma_attestation:click:enable_dynamite_version", 213806100L);
    public static final zzbfv zzf;
    public static final zzbfv zzg;
    public static final zzbfv zzh;
    public static final zzbfv zzi;
    public static final zzbfv zzj;
    public static final zzbfv zzk;

    static {
        boolean bl2 = true;
        zzf = zzbfv.zzd("gads:gma_attestation:click:qualification:enable", bl2);
        zzg = zzbfv.zzd("gads:gma_attestation:image_hash", false);
        zzh = zzbfv.zzd("gads:gma_attestation:impression:enable", bl2);
        zzi = zzbfv.zzd("gads:gma_attestation:request:enable_javascript", false);
        zzj = zzbfv.zzd("gads:gma_attestation:request:enable", bl2);
        zzk = zzbfv.zzd("gads:gma_attestation:click:report_error", bl2);
    }
}

