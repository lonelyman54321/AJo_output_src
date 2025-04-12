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
import com.google.android.gms.internal.ads.zzuf;

final class zzug
implements zzue {
    private zzug() {
        throw null;
    }

    public /* synthetic */ zzug(zzuf zzuf2) {
    }

    public final int zza() {
        return MediaCodecList.getCodecCount();
    }

    public final MediaCodecInfo zzb(int n3) {
        return MediaCodecList.getCodecInfoAt((int)n3);
    }

    public final boolean zzc(String string2, String string3, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    public final boolean zzd(String string2, String string3, MediaCodecInfo.CodecCapabilities object) {
        object = "secure-playback";
        boolean bl2 = ((String)object).equals(string2);
        return bl2 && (bl2 = (string2 = "video/avc").equals(string3));
    }

    public final boolean zze() {
        return false;
    }
}

