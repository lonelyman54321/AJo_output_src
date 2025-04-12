/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaCodecInfo
 *  android.media.MediaCodecInfo$CodecCapabilities
 *  android.media.MediaCodecList
 */
package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import com.google.android.gms.internal.ads.zzue;

final class zzuh
implements zzue {
    private final int zza;
    private MediaCodecInfo[] zzb;

    public zzuh(boolean bl2, boolean bl3) {
        int n3 = 1;
        if (!bl2 && !bl3) {
            n3 = 0;
        }
        this.zza = n3;
    }

    private final void zzf() {
        MediaCodecInfo[] mediaCodecInfoArray = this.zzb;
        if (mediaCodecInfoArray == null) {
            int n3 = this.zza;
            MediaCodecList mediaCodecList = new MediaCodecList(n3);
            this.zzb = mediaCodecInfoArray = mediaCodecList.getCodecInfos();
        }
    }

    public final int zza() {
        this.zzf();
        return this.zzb.length;
    }

    public final MediaCodecInfo zzb(int n3) {
        this.zzf();
        return this.zzb[n3];
    }

    public final boolean zzc(String string2, String string3, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(string2);
    }

    public final boolean zzd(String string2, String string3, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(string2);
    }

    public final boolean zze() {
        return true;
    }
}

