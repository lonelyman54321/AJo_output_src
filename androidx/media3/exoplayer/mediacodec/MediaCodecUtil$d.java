/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaCodecInfo
 *  android.media.MediaCodecInfo$CodecCapabilities
 *  android.media.MediaCodecList
 */
package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil$b;

public final class MediaCodecUtil$d
implements MediaCodecUtil$b {
    public final int a;
    public MediaCodecInfo[] b;

    public MediaCodecUtil$d(boolean bl2, boolean bl3) {
        bl2 = bl2 || bl3;
        this.a = (int)(bl2 ? 1 : 0);
    }

    public final MediaCodecInfo a(int n3) {
        MediaCodecInfo[] mediaCodecInfoArray = this.b;
        if (mediaCodecInfoArray == null) {
            int n4 = this.a;
            mediaCodecInfoArray = new MediaCodecList(n4);
            mediaCodecInfoArray = mediaCodecInfoArray.getCodecInfos();
            this.b = mediaCodecInfoArray;
        }
        return this.b[n3];
    }

    public final boolean b(String string2, String string3, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(string2);
    }

    public final boolean c(String string2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(string2);
    }

    public final int d() {
        MediaCodecInfo[] mediaCodecInfoArray = this.b;
        if (mediaCodecInfoArray == null) {
            int n3 = this.a;
            mediaCodecInfoArray = new MediaCodecList(n3);
            mediaCodecInfoArray = mediaCodecInfoArray.getCodecInfos();
            this.b = mediaCodecInfoArray;
        }
        return this.b.length;
    }

    public final boolean e() {
        return true;
    }
}

