/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaCrypto
 *  android.media.MediaFormat
 *  android.view.Surface
 */
package com.google.android.gms.internal.ads;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zztp;

public final class zztk {
    public final zztp zza;
    public final MediaFormat zzb;
    public final zzan zzc;
    public final Surface zzd;
    public final MediaCrypto zze;

    private zztk(zztp zztp2, MediaFormat mediaFormat, zzan zzan2, Surface surface, MediaCrypto mediaCrypto, int n3) {
        this.zza = zztp2;
        this.zzb = mediaFormat;
        this.zzc = zzan2;
        this.zzd = surface;
        this.zze = null;
    }

    public static zztk zza(zztp zztp2, MediaFormat mediaFormat, zzan zzan2, MediaCrypto object) {
        object = new zztk(zztp2, mediaFormat, zzan2, null, null, 0);
        return object;
    }

    public static zztk zzb(zztp zztp2, MediaFormat mediaFormat, zzan zzan2, Surface surface, MediaCrypto object) {
        object = new zztk(zztp2, mediaFormat, zzan2, surface, null, 0);
        return object;
    }
}

