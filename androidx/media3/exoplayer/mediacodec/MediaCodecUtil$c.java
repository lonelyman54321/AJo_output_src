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

public final class MediaCodecUtil$c
implements MediaCodecUtil$b {
    public final MediaCodecInfo a(int n3) {
        return MediaCodecList.getCodecInfoAt((int)n3);
    }

    public final boolean b(String string2, String string3, MediaCodecInfo.CodecCapabilities object) {
        object = "secure-playback";
        boolean bl2 = ((String)object).equals(string2);
        if (bl2 && (bl2 = (string2 = "video/avc").equals(string3))) {
            bl2 = true;
        } else {
            bl2 = false;
            string2 = null;
        }
        return bl2;
    }

    public final boolean c(String string2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    public final int d() {
        return MediaCodecList.getCodecCount();
    }

    public final boolean e() {
        return false;
    }
}

