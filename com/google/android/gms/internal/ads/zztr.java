/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaCodecInfo$VideoCapabilities
 */
package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zztq;

final class zztr {
    private static Boolean zza;

    public static int zza(MediaCodecInfo.VideoCapabilities videoCapabilities, int n3, int n4, double d2) {
        Boolean bl2;
        int n7 = zzgd.zza;
        int n8 = 29;
        if (n7 >= n8 && ((bl2 = zza) == null || (n7 = (int)(bl2.booleanValue() ? 1 : 0)) == 0)) {
            return zztq.zza(videoCapabilities, n3, n4, d2);
        }
        return 0;
    }

    public static /* bridge */ /* synthetic */ Boolean zzb() {
        return zza;
    }

    public static /* bridge */ /* synthetic */ void zzc(Boolean bl2) {
        zza = bl2;
    }
}

